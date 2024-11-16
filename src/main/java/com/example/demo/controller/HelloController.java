package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class HelloController {

    @GetMapping
    public String hello(@Value("${value.name}") String name) {
        return "Hello World "  + name;
    }

}
