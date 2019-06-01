package com.wzt.mybatis.demo.service.impl;

import com.wzt.mybatis.demo.common.ResponseCode;
import com.wzt.mybatis.demo.exception.BusinessException;
import com.wzt.mybatis.demo.mapper.CountryMapper;
import com.wzt.mybatis.demo.model.Country;
import com.wzt.mybatis.demo.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryMapper countryDao;

    @Override
    public Country findById(Integer id) {
//         throw new BusinessException(ResponseCode.BUSINESS.getCode(), "常数错误");
        return countryDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Country> findAllCountry() {
        return countryDao.findAll();
    }

}
