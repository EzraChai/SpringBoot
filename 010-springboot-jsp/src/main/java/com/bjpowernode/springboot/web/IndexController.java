package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/say")
    public ModelAndView user(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Hello, SpringBoot");
        mv.setViewName("say");
        return mv;
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","Hello World");
        return "say";
    }
}
