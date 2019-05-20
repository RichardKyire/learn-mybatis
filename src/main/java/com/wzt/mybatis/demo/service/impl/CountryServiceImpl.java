package com.wzt.mybatis.demo.service.impl;

import com.wzt.mybatis.demo.mapper.CountryMapper;
import com.wzt.mybatis.demo.model.Country;
import com.wzt.mybatis.demo.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryMapper countryDao;

    @Override
    public Country findById(Integer id) {
        return countryDao.selectByPrimaryKey(id);
    }
}
