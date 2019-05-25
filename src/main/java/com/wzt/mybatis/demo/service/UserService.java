package com.wzt.mybatis.demo.service;

import com.wzt.mybatis.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectByUserName(String userName);

    List<User> selectUserRole();

}
