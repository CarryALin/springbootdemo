package com.testencrypt.project.springbootdemo.controller;

import com.testencrypt.project.springbootdemo.anno.DS;
import com.testencrypt.project.springbootdemo.bean.TestUser;
import com.testencrypt.project.springbootdemo.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/testuser")
public class TestUserController {

    @Autowired
    TestUserService service;

    @DS("shareen")
    @PostMapping("/getAllData")
    public void getAllData( @RequestParam(required = false) String keyword) {

        List<TestUser> list = service.getAll(keyword);
    }


    @DS("shareen")
    @PostMapping("/addtest")
    public void addtest(@RequestBody TestUser testUser) {
        service.addTest(testUser);
    }
}
