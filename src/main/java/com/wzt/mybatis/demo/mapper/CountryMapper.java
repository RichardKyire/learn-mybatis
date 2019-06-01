package com.wzt.mybatis.demo.mapper;

import com.wzt.mybatis.demo.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<Country> findAll();
}