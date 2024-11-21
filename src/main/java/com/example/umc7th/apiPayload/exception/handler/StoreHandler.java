package com.example.umc7th.apiPayload.exception.handler;

import com.example.umc7th.apiPayload.code.BaseErrorCode;
import com.example.umc7th.apiPayload.exception.GeneralException;

public class StoreHandler extends GeneralException {

    public StoreHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
