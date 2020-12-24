package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  //定义此类为配置文件（及之前的xml配置文件）
public class InterceptorConfig implements WebMvcConfigurer {

    //  mvc:interceptors
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String[] addPath = {"/user/**"};
        String[] excludePath = {"/user/out","/user/error","/user/login"};

        //  mvc:interceptors bean class=""
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPath).excludePathPatterns(excludePath);
    }
}
