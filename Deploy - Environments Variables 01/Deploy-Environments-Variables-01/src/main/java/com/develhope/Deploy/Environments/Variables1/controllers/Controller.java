package com.develhope.Deploy.Environments.Variables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v")
public class Controller {
    @Value("${devName}")
    private String developerName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/ottieniStringa")
    public String ottieniStringa() {
        return "ciao " + developerName + " il tuo codice di autenticazione è " + authCode;
    }
}
