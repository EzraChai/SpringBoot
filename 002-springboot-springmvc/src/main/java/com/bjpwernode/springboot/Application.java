package com.bjpwernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication  //开启SPringBoot核心配置
public class Application {

    // 1.代码必须放在application同级目录或下级目录

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
