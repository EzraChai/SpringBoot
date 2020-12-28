package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.exception.StudentNotFoundException;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        if (null == student){
            throw new StudentNotFoundException("Student Not Found");
        }
        return student;
    }

    @Override
    public int queryStudentCount() {
        Integer studentCount;

        studentCount = (Integer) redisTemplate.opsForValue().get("StudentCount");
        if (null == studentCount) {
            studentCount = studentMapper.studentCount();
            redisTemplate.opsForValue().set("StudentCount", studentCount, 30, TimeUnit.SECONDS);
        }
        return studentCount;
    }
}
