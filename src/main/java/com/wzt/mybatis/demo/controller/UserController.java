package com.wzt.mybatis.demo.controller;

import com.wzt.mybatis.demo.model.User;
import com.wzt.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired private UserService userService;

  @GetMapping("/all")
  List<User> selectAll() {
    return userService.selectAll();
  }

  @GetMapping("/{userName}")
  User selectByUserName(@PathVariable(name = "userName") String userName) {
    return userService.selectByUserName(userName);
  }

  @GetMapping("/allUserWithRoles")
  List<User> selectUserRoles(){
    return userService.selectUserRole();
  }

  @GetMapping("/allUserWithRolesAndPrivilege")
  List<User> allUserWithRolesAndPrivilege(){
    return userService.selectUserRolePrivilegeAll();
  }
}
