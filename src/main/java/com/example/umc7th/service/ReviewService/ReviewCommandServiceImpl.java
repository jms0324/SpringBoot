
package com.example.umc7th.service.ReviewService;

import com.example.umc7th.apiPayload.code.status.ErrorStatus;
import com.example.umc7th.apiPayload.exception.handler.MemberHandler;
import com.example.umc7th.apiPayload.exception.handler.StoreHandler;
import com.example.umc7th.converter.ReviewConverter;
import com.example.umc7th.domain.Member;
import com.example.umc7th.domain.Review;
import com.example.umc7th.domain.Store;
import com.example.umc7th.repository.MemberRepository;
import com.example.umc7th.repository.ReviewRepository;
import com.example.umc7th.repository.StoreRepository;
import com.example.umc7th.web.dto.ReviewDto.ReviewRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService {
    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;
    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Review joinReview(ReviewRequestDTO.ReviewCreateDTO request) {

        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
        Store store = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));

        Review createdReview = ReviewConverter.toReview(request, member, store);

        return reviewRepository.save(createdReview);
    }

}
