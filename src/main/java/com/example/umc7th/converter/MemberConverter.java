package com.example.umc7th.converter;

import com.example.umc7th.web.dto.MemberDto.MemberResponseDto;

public class MemberConverter {

    public static MemberResponseDto.JoinResultDTO toJoinResultDTO(Long memberId){
        return MemberResponseDto.JoinResultDTO.builder()
                .memberId(memberId)
                .createdAt(null)
                .build();
    }
}
