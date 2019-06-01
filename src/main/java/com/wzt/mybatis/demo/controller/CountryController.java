package com.wzt.mybatis.demo.controller;

import com.wzt.mybatis.demo.common.ApiResponse;
import com.wzt.mybatis.demo.model.Country;
import com.wzt.mybatis.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @RequestMapping("/getCountry")
    public ApiResponse getCountry(Integer id){
        Country country = countryService.findById(1);
        System.out.println(country);
        return  ApiResponse.create(country);
    }

    @GetMapping("all")
    public ApiResponse getAllCountry(Integer id){
        List<Country> countryList = countryService.findAllCountry();
        return ApiResponse.create(countryList);
    }
}
