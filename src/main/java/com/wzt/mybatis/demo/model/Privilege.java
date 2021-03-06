package com.wzt.mybatis.demo.model;

public class Privilege {
    private Long id;

    private String privilegeName;

    private String privilegeUrl;

    public Privilege(Long id, String privilegeName, String privilegeUrl) {
        this.id = id;
        this.privilegeName = privilegeName;
        this.privilegeUrl = privilegeUrl;
    }

    public Privilege() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }
}