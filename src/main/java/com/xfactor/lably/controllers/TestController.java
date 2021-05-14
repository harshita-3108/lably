package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import com.xfactor.lably.entity.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/test")
public class TestController {

    ArrayList<Test> tests = new ArrayList<>();

    
   


    @PostMapping("/addTest")
    public Test registerPost(@RequestBody Test test) {
        tests.add(test);
        return test;
    }

    @GetMapping("/getAllTest")
    public ArrayList<Test> getTests() {
        return tests;
    }

    @GetMapping("/getTestByUserName")
    public Test getAdminByUserName(@RequestParam String username) {
        Test resTest = null;
        for (Test test: tests) {
            if (test.getName().equalsIgnoreCase(username)) {
                resTest = test;
            }
        }
        return resTest;
    }

}