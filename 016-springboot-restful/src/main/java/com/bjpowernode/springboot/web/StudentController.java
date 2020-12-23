package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student student(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //使用RESTful 风格
    @GetMapping("/student/detail/{id}/{age}")
    public Object student2(@PathVariable("id")Integer id,@PathVariable("age") Integer age){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;
    }

    @DeleteMapping("/student/detail/{id}/{status}")
    public Object student3(@PathVariable("id")Integer id,@PathVariable("status") Integer status){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id",id);
        retMap.put("status",status);
        return retMap;
    }

    @DeleteMapping("/student/${city}/detail/{id}")
    public Object student4(@PathVariable("id")Integer id,@PathVariable("city") String city){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id",id);
        retMap.put("city",city);
        return retMap;
    }
}
