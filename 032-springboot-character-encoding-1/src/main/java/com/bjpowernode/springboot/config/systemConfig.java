package com.bjpowernode.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class systemConfig {
    @Bean
    public FilterRegistrationBean characterEncoding(){
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //设置强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        //设置字符编码字符
        filterRegistrationBean.setFilter(characterEncodingFilter);

        //设置字符编码过滤器
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
