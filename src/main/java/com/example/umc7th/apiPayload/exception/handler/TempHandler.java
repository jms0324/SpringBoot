package com.example.umc7th.apiPayload.exception.handler;

import com.example.umc7th.apiPayload.code.BaseErrorCode;
import com.example.umc7th.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
    //서비스에서 핸들러를 만들면 제네럴 익셉션 생성 (상속받아서)
    //이건 익셉션핸들러에서 익셉션감지





}