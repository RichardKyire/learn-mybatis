package com.wzt.mybatis.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Role {
    private Long id;

    private String roleName;

    private Integer enabled;

    private Long createBy;

    private Date createTime;

}