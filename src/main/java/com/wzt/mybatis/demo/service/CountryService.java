package com.wzt.mybatis.demo.service;

import com.wzt.mybatis.demo.model.Country;

import java.util.List;

public interface CountryService {
    Country findById(Integer id);

    List<Country> findAllCountry();
}
