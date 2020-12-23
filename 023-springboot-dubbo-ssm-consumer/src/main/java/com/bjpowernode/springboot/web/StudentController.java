package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceName = "com.bjpowernode.springboot.service.StudentService",version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable Integer id){
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }

    @GetMapping("/student/all/count")
    public @ResponseBody String allStudentCount(){
        Integer count = studentService.queryAllStudentCount();
        return "Total number of students : " + count;
    }
}
