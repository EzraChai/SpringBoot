package com.bjpwernode.springboot.service.impl;

import com.bjpwernode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "say " + msg ;
    }
}
