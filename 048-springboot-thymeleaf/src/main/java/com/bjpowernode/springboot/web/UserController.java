package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model,Integer id) {
        model.addAttribute("username", "Chloe");
        request.getSession().setAttribute("data", "sessionData");
        return "index";
    }
}
