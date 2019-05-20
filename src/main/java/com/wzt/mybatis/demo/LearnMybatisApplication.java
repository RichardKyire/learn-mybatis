package com.wzt.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzt.mybatis.demo.mapper")
public class LearnMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisApplication.class, args);
    }

}
