package com.example.Deploy_01.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class DevController {

    @Autowired
    public Environment environment;

    @GetMapping("/get")
    public String getDevName(){
        return environment.getProperty("devName");
    }
}