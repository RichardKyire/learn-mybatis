package com.wzt.mybatis.demo.controller;

import com.wzt.mybatis.demo.common.ApiResponse;
import com.wzt.mybatis.demo.common.ResponseCode;
import com.wzt.mybatis.demo.exception.BusinessException;
import com.wzt.mybatis.demo.model.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testboot")
public class TestBootController {
  @RequestMapping("getCountry")
  public Country getCountry() {
    Country country = new Country();
    country.setCountryname("China");
    throw new IllegalArgumentException("参数错误");
  }
}
