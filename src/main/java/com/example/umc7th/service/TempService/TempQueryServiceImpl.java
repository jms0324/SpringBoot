package com.example.umc7th.service.TempService;

import com.example.umc7th.apiPayload.code.status.ErrorStatus;
import com.example.umc7th.apiPayload.exception.handler.TempHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION); //1이면 템프핸들러에게 에러스테이터스 넘겨줌
    }
}
