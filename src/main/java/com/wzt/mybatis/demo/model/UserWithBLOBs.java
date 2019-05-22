package com.wzt.mybatis.demo.model;

public class UserWithBLOBs extends User {
    private String userInfo;

    private byte[] headImg;

    public UserWithBLOBs(Long id, String userName, String userPassword, String userEmail, Date createTime, String userInfo, byte[] headImg) {
        super(id, userName, userPassword, userEmail, createTime);
        this.userInfo = userInfo;
        this.headImg = headImg;
    }

    public UserWithBLOBs() {
        super();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}