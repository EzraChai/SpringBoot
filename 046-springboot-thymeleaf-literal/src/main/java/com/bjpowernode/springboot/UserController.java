package com.bjpowernode.springboot;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("/literal")
    public String literal(Model model){
        model.addAttribute("sex",1);
        model.addAttribute("data","SpringBoot Data");
        model.addAttribute("date",new Date());
        model.addAttribute("flag",true);

        User user = new User();
        user.setUsername("Chloe");
        user.setId(1001);
        model.addAttribute("user",user);

        User userDetail = new User();
        model.addAttribute("userDetail",userDetail);

        return "literal";
    }

    @RequestMapping("/splice")
    public String page(Model model){
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",12);
        model.addAttribute("currentPage",2);
        return "splice";
    }
}
