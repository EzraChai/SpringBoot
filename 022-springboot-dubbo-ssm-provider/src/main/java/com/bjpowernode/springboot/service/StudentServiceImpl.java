package com.bjpowernode.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceName = "com.bjpowernode.springboot.service.StudentService",version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {

        //提升系统性能，用户体验升级
        //首先去redis缓存中查询，如果有：直接使用，如果没有：去数据库查询
        Integer count = 0;

        count = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if(null == count){
            count = studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount",count,30, TimeUnit.SECONDS);
        }

        return count;
    }
}
