package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        /**
         * SpringBoot 程序启动之后，返回值是ConfigurableApplicationContext,他也是一个Spring容器
         * 他其实相当于原来Spring容器中启动容器 Classpath: ApplicationContext.xml
         */
        //获取SpringBoot容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //从Spring容器中取得指定bean对象
        StudentService service = (StudentService) applicationContext.getBean("studentServiceImpl");
        //调用业务方法
        String hello = service.sayHello();
        System.out.println(hello);
    }

}
