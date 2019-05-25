package com.wzt.mybatis.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserWithBLOBs extends User {
    private String userInfo;

    private byte[] headImg;

}