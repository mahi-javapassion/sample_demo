package com.mahi.javapassion.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-demo")
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "Hello Word";
    }
}
