package com.example.spring.application1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class hellocontroller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    

}
