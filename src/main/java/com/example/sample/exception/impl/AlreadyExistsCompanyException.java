package com.example.sample.exception.impl;

import com.example.sample.exception.AbstractException;
import org.springframework.http.HttpStatus;

public class AlreadyExistsCompanyException extends AbstractException {
    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public String getMessage() {
        return "이미 존재하는 회사정보 입니다.";
    }
}
