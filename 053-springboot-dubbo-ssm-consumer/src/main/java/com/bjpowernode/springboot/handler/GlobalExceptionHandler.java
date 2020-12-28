package com.bjpowernode.springboot.handler;

import com.bjpowernode.springboot.exception.StudentNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public String StudentNotFoundException(Exception ex){
        System.out.println("Exception Occur");
        return "Exception";
    }
}
