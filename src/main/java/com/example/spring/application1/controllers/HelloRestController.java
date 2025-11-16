package com.example.spring.application1.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloRestController {

    @GetMapping("/hellorestcontroller")
    public Map<String, Object> hello_rest() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from Rest Controller!");
        response.put("status", "success");
        return response;
    }
}
