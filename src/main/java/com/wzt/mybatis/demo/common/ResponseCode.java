package com.wzt.mybatis.demo.common;

import lombok.Getter;

@Getter
public enum ResponseCode {

    FAIL(0),
    SUCCESS(1),
    BUSINESS(2);


    private int code;

    ResponseCode(int code) {
        this.code = code;
    }
}
