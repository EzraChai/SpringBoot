package com.bjpowernode.springboot.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}
