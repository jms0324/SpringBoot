package com.example.umc7th.service.MemberService;

import com.example.umc7th.domain.Member;
import com.example.umc7th.web.dto.MemberDto.MemberRequestDTO;

public interface MemberCommandSerivce {


        Member joinMember(MemberRequestDTO.JoinDto request);

}
