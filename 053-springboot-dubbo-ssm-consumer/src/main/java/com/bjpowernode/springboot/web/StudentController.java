package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable("id")Integer id){
        Student student = studentService.queryStudentById(id);
        model.addAttribute(student);
        return "studentDetail";
    }

    @RequestMapping("/")
    public String index(Model model){
        int studentCount = studentService.queryStudentCount();
        model.addAttribute("studentCount",studentCount);
        return "index";
    }
}
