package com.example.umc7th.service.MemberService;

import com.example.umc7th.apiPayload.code.status.ErrorStatus;
import com.example.umc7th.apiPayload.exception.handler.FoodCategoryHandler;
import com.example.umc7th.converter.MemberConverter;
import com.example.umc7th.converter.MemberPreferConverter;
import com.example.umc7th.domain.FoodCategory;
import com.example.umc7th.domain.Member;
import com.example.umc7th.domain.mapping.MemberPrefer;
import com.example.umc7th.repository.FoodCategoryRepository;
import com.example.umc7th.repository.MemberRepository;
import com.example.umc7th.web.dto.MemberDto.MemberRequestDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandSerivce {

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional // 트랜잭션 처리
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);
        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }

}
