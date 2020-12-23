package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class studentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody
    Student QueryStudentById(Integer id){

        //调用Service方法
        Student student = studentService.queryStudentById(id);

        return student;
    }
}
