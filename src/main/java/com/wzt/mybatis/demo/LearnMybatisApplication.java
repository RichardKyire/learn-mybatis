package com.wzt.mybatis.demo;

import com.wzt.mybatis.demo.mapper.CountryMapper;
import com.wzt.mybatis.demo.model.Country;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;


@SpringBootApplication
@MapperScan("com.wzt.mybatis.demo.mapper")
public class LearnMybatisApplication implements CommandLineRunner {

    @Resource
    CountryMapper countryMapper;

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       Country country = countryMapper.selectByPrimaryKey(1);
    System.out.println(country);
    }
}
