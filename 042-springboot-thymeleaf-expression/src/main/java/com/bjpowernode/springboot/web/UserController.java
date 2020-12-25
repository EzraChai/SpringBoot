package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/detail")
    public String userDetail(Model model) {
        User user = new User();
        user.setId(1010);
        user.setUsername("Chloe Gan");
        user.setAge(16);
        model.addAttribute("user", user);
        return "userDetail";
    }

    @RequestMapping("/url")
    public String urlExpression(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("Username","Chloe Gan");
        model.addAttribute("age",16);
        return "url";
    }

    @RequestMapping("/test")
    public @ResponseBody
    String test(String username) {
        return "请求路径是/test,参数是：" + username;
    }

    @RequestMapping("/test1")
    public @ResponseBody
    String test1(Integer id, String username, Integer age) {
        return "请求路径是/test1,参数是 username：" + username + ", id：" + id + ", age：" + age;
    }

    @RequestMapping("/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id")Integer id){
        return "ID = " + id;
    }

    @RequestMapping("/test3/{id}/{username}")
    public @ResponseBody String test2(@PathVariable("id")Integer id,@PathVariable("username")String username){
        return "ID = " + id + ",Username = " + username;
    }

    @RequestMapping("/url2")
    public String url2(){
        return "url2";
    }
}
