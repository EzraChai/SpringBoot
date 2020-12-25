package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import lombok.extern.java.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/count")
    public @ResponseBody String studentCount(){

        Integer count = studentService.queryStudentCount();
        return "学生总人数为：" + count;
    }
}
