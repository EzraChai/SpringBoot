package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/detail")
    public @ResponseBody String userDetail(){
        return "user Detail";
    }

    @RequestMapping("/central")
    public @ResponseBody String central(){
        return "central";
    }
}
