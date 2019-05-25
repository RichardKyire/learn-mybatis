package com.wzt.mybatis.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Role {
  private Long id;

  private String roleName;

  private Integer enabled;

  private Long createBy;

  private Date createTime;

  private List<Privilege> privilegeList;

  public Role(Long id, String roleName, Integer enabled, Long createBy, Date createTime) {
    this.id = id;
    this.roleName = roleName;
    this.enabled = enabled;
    this.createBy = createBy;
    this.createTime = createTime;
  }
}
