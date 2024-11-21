
package com.example.umc7th.apiPayload.exception.handler;

import com.example.umc7th.apiPayload.code.BaseErrorCode;
import com.example.umc7th.apiPayload.exception.GeneralException;

public class MemberHandler extends GeneralException {
    public MemberHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }

}
