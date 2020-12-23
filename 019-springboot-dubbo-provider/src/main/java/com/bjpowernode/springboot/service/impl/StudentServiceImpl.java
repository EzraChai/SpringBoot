package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        //调用数据持久层
        return 124;
    }
}
