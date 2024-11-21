package com.example.umc7th.apiPayload.exception.handler;

import com.example.umc7th.apiPayload.code.BaseErrorCode;
import com.example.umc7th.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
