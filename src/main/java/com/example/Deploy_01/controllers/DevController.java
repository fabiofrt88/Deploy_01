package com.example.Deploy_01.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @GetMapping("/")
    public String getDevName(){
        return "Fabio";
    }
}