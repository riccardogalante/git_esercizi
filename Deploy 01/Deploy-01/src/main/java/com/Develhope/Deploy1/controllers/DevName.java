package com.Develhope.Deploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/returnName")
public class DevName {
    @GetMapping("/")
    public String returnMyName(){
        return "Riccardo";
    }
}
