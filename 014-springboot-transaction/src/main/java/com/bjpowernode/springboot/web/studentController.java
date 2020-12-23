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
    Object updateStudent(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);
        if (updateCount == 1) {
            return "Modify Student's name with an ID of [" + student.getId() + "].  Result: success";
        }else{
            return "Modify Student's name with an ID of [" + student.getId() + "].  Result: failed";
        }
    }
}
