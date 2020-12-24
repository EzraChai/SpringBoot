package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.myServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //将此注解定义为配置类
public class ServletConfiguration {

    //方法级别上的注解
    //相当于一个Beans标签
    //<beans>
    //</beans>
    @Bean
    public ServletRegistrationBean myServlet(){

        ServletRegistrationBean servletRegistrationBean  = new ServletRegistrationBean(new myServlet(),"/myServlet");
        return servletRegistrationBean;
    }
}
