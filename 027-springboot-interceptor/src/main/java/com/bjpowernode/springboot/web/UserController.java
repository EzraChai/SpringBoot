package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public @ResponseBody Object login(HttpServletRequest request){
        User user = new User();
        user.setId(1001);
        user.setUsername("Chloe Gan");
        //将用户存放到Session中
        request.getSession().setAttribute("user",user);

        return "Login Successful";
    }

    @RequestMapping("/logout")
    public @ResponseBody Object logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "Logout Successfully";
    }

    //该请求需要用户登录才可以访问
    @RequestMapping("/central")
    public @ResponseBody Object central(){
        return "Central";
    }

    //该请求不登录也可以访问
    @RequestMapping("/out")
    public @ResponseBody Object out(){
        return "Out see anytime";
    }

    //如果用户未登录，访问了需要登陆才可以访问的请求,之后会跳转去该请求路径
    @RequestMapping("/error")
    public @ResponseBody Object error(){
        return "error";
    }
}
