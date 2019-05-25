package com.wzt.mybatis.demo.service.impl;

import com.wzt.mybatis.demo.mapper.UserMapper;
import com.wzt.mybatis.demo.model.User;
import com.wzt.mybatis.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Resource private UserMapper userMapper;

  @Override
  public List<User> selectAll() {
    return userMapper.selectAll();
  }

  @Override
  public User selectByUserName(String userName) {
    return userMapper.selectByUserName(userName);
  }

  @Override
  public List<User> selectUserRole() {
    return userMapper.selectUserRoleAll();
  }

  @Override
  public List<User> selectUserRolePrivilegeAll() {
    return userMapper.selectUserRolePrivilegeAll();
  }
}
