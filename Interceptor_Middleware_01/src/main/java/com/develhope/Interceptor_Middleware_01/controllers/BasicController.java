package com.develhope.Interceptor_Middleware_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/basic")
public class BasicController {

    /**
     * Returns the current date and time as a string in the format "yyyy-MM-dd HH:mm:ss"
     *
     * @return the current date and time as a string
     */
    @GetMapping("/time")
    public String getTime() {
        return LocalDateTime.now().toString();
    }

}