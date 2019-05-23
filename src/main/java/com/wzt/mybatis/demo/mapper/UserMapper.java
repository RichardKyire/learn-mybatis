package com.wzt.mybatis.demo.mapper;

import com.wzt.mybatis.demo.model.User;
import com.wzt.mybatis.demo.model.UserWithBLOBs;
import com.wzt.mybatis.demo.provider.UserProvider;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    @SelectProvider(type= UserProvider.class,method = "selectByUserName")
    User selectByUserName(String userName);
}