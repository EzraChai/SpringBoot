package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "say: Hello SpringBoot";
    }

    @RequestMapping("/mapValue")
    public @ResponseBody Map<String,Object> mapValue(){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("msg","SpringBoot Project");
        return retMap;
    }
}
