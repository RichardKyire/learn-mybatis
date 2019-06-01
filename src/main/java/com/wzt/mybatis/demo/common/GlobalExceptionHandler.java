package com.wzt.mybatis.demo.common;

import com.wzt.mybatis.demo.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public ApiResponse allExceptionHandler(Exception exception) 		{
        exception.printStackTrace();
        if(exception instanceof BusinessException){
            return ApiResponse.create((BusinessException) exception);
        }

        return ApiResponse.createError();
    }

}
