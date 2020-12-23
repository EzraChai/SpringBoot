package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController //控制层类上 加 @Controller + 方法上加 @ResponseBody
public class StudentController {

    @RequestMapping("/student")
    public Object student(){
        Student student = new Student();
        student.setId(100);
        student.setName("Chloe Gan");
        student.setAge(15);
        return student;
    }

    @RequestMapping("/queryStudentById")
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

    //@RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping("/queryStudentById2")
    public Object queryStudentById2(){
        return "Only Can Use Get Method";
    }

    //@RequestMapping(value = "/queryStudentById3",method = RequestMethod.POST)
    @PostMapping("/insert")
    public Object insertStudent(){
        return "Only Can Use POST Method";
    }

    @DeleteMapping("/delete")
    public Object delete(){
        return "Delete Succesful";
    }

    @PutMapping("/updateSudentInfo")
    public Object updateSudentInfo(){
        return "Update Student Info successful";
    }
}
