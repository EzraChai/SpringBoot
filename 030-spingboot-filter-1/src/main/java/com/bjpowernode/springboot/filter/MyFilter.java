package com.bjpowernode.springboot.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/myfilter")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("------------你已进入过滤器-------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
