package com.wzt.mybatis.demo.mapper;

import com.wzt.mybatis.demo.model.User;
import com.wzt.mybatis.demo.model.UserWithBLOBs;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}