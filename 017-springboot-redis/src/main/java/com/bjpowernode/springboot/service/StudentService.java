package com.bjpowernode.springboot.service;

public interface StudentService {
    /**
     * 将值存放到Redis 中
     * @param key
     * @param value
     */
    void put(String key, String value);

    String get(String key);
}
