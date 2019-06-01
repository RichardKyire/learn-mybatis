package com.wzt.mybatis.demo.exception;

import com.wzt.mybatis.demo.common.ResponseCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends RuntimeException {

    protected int errorCode  ;

    public BusinessException(String message,  Throwable e){
        super(message,e);
        this.errorCode = ResponseCode.BUSINESS.getCode();
    }

    public BusinessException(String message){
        super(message,null);
        this.errorCode = ResponseCode.BUSINESS.getCode();
    }

    public BusinessException(int errorCode,String message){
        super(message,null);
        this.errorCode = errorCode;
    }

}
