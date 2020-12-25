package com.bjpowernode.springboot.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/operator")
    public String operator(Model model) {
        model.addAttribute("sex", 1);
        model.addAttribute("flag", true);
        return "operator";
    }
}
