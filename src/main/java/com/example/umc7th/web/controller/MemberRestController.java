package com.example.umc7th.web.controller;


import com.example.umc7th.apiPayload.ApiResponse;
import com.example.umc7th.converter.MemberConverter;
import com.example.umc7th.domain.Member;
import com.example.umc7th.service.MemberService.MemberCommandSerivce;
import com.example.umc7th.web.dto.MemberDto.MemberRequestDTO;
import com.example.umc7th.web.dto.MemberDto.MemberResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandSerivce memberCommandSerivce;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandSerivce.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
