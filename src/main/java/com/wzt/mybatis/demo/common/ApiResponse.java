package com.wzt.mybatis.demo.common;

import com.wzt.mybatis.demo.exception.BusinessException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
public class ApiResponse<T> {
  private int code;
  private String message;
  private T data;

  private ApiResponse(int code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  private ApiResponse(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public static ApiResponse create(Object data) {
    return new ApiResponse(ResponseCode.SUCCESS.getCode(), "调用成功", data);
  }

  public static ApiResponse create(BusinessException e) {
    return new ApiResponse(e.getErrorCode(),e.getMessage());
  }

  public static ApiResponse createError() {
    return createError("系统异常");
  }

  public static ApiResponse createError(String message) {
    return new ApiResponse(
        ResponseCode.FAIL.getCode(), StringUtils.isEmpty(message) ? "系统异常" : message);
  }
}
