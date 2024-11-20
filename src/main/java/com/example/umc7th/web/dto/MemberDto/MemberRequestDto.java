package com.example.umc7th.web.dto.MemberDto;

import lombok.Getter;

import java.util.List;

public class MemberRequestDto {

    @Getter
    public static class JoinDto{

        String name;
        Integer gender;
        Integer birthYear;
        Integer birthMonth;
        Integer birthDay;
        String address;
        String specAddress;
        List<Long> preferCategory;

    }
}
