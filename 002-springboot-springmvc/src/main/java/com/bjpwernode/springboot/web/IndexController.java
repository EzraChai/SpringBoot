package com.bjpwernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springboot")
public class IndexController {

    @RequestMapping("/say")
    public @ResponseBody String say(){
        return "Hello SpringBoot";
    }
}
