package com.example.umc7th.converter;

import com.example.umc7th.web.dto.TempResponse;

public class TempConverter {

    public static TempResponse.TempTestDTO toTempTestDTO(){
        return TempResponse.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }

    public static TempResponse.TempExceptionDTO toTempExceptionDTO(Integer flag){
        return TempResponse.TempExceptionDTO.builder() // flag를 받아서 TempExceptionDTO로 변환
                .flag(flag)
                .build();


    }
}
