package com.example.umc7th.web.controller;

import com.example.umc7th.apiPayload.ApiResponse;
import com.example.umc7th.converter.TempConverter;
import com.example.umc7th.service.TempService.TempQueryService;
import com.example.umc7th.web.dto.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {  //이거 안에 servlet이 있음

    private final TempQueryService tempQueryService;

    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }

    @GetMapping("/exception")  //exception 경로로 오는 값을 받아서 flag에 넣어줌
    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag); // flag가 1이면 TempQueryServiceImpl에서 TempHandler로 넘겨줌
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));

    }
}