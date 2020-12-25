package com.bjpowernode.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/user/json/detail")
    public @ResponseBody Object userJsonDetail(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1001);
        map.put("name","Chloe Gan");
        return map;
    }

    @RequestMapping("/user/page/detail")
    public String userPageDetail(Model model){
        model.addAttribute("id",1002);
        model.addAttribute("username","Ezra Chai");
        return "UserPageDetail";
    }
}
