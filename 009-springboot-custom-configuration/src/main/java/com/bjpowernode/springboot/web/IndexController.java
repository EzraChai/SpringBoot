package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.config.Girlfriend;
import com.bjpowernode.springboot.config.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    private School school;

    @Resource
    private Girlfriend gf;

    @RequestMapping("say")
    public @ResponseBody String say(){
        return"School.name = " + school.getName() + "---------- school.website = " + school.getWebsite();
    }

    @RequestMapping("Girlfriend")
    public @ResponseBody String gf(){
        return "Girlfriend: " + gf.getName() + ",  age: " + gf.getAge();
    }
}
