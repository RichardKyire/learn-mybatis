package com.wzt.mybatis.demo.provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {

    public String selectByUserName(final String userName){
        return new SQL(){
            {
                SELECT("sys_user.id ,\n" +
                        "sys_user.user_name ,\n" +
                        "sys_user.user_password ,\n" +
                        "sys_user.user_info ,\n" +
                        "sys_user.user_email ,\n" +
                        "sys_user.head_img ,\n" +
                        "sys_user.create_time ");
                FROM("sys_user");
                WHERE("user_name=#{userName}");
            }
        }.toString();
    }
}
