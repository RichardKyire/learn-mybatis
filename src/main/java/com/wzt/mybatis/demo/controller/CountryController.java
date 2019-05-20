package com.wzt.mybatis.demo.controller;

import com.wzt.mybatis.demo.model.Country;
import com.wzt.mybatis.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @RequestMapping("/getCountry")
    public Country getCountry(Integer id){
        Country country = countryService.findById(1);
    System.out.println(country);
        return country;
    }
}
