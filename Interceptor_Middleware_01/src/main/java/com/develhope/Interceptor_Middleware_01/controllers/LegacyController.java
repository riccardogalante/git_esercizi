package com.develhope.Interceptor_Middleware_01.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    /**
     * This method is responsible for returning a legacy message.
     *
     * @return the legacy message
     */
    @GetMapping("/message")
    public String getLegacy() {
        return "This is just old code";
    }

}