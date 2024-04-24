package com.develhope.Interceptor_Middleware_02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class BasicController {
    @GetMapping("/")
    public String returnWelcome(){
        return "Welcome";
    }
}
