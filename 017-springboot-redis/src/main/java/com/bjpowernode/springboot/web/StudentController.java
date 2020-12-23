package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/put")
    public @ResponseBody Object put(String key,String value){

        studentService.put(key,value);
        return "值已成功放入redis";
    }

    @GetMapping("/get")
    public @ResponseBody Object get(String key){
        String value = studentService.get(key);
        return  key + " =  " + value;
    }
}
