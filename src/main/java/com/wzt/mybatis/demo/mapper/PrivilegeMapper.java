package com.wzt.mybatis.demo.mapper;

import com.wzt.mybatis.demo.model.Privilege;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}