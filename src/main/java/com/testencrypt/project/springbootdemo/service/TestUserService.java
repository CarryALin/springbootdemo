package com.testencrypt.project.springbootdemo.service;

import com.testencrypt.project.springbootdemo.bean.TestUser;
import com.testencrypt.project.springbootdemo.mapper.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserService{

    @Autowired
    TestUserMapper mapper;


    public void addTest(TestUser testUser) {
        mapper.addTest(testUser);
    }

    public List<TestUser> getAll(String keyword) {
        return mapper.getAllData(keyword);
    }
}
