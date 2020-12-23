package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    //根据学生查询详情
    Student queryStudentById(Integer id);
}
