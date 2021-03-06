package com.bjpowernode.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper") //开启扫描Mapper接口的包以及子包
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
