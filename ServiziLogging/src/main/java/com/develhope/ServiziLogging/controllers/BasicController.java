package com.develhope.ServiziLogging.controllers;
import com.develhope.ServiziLogging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    private Logger logger = LoggerFactory.getLogger(BasicService.class);

    @Autowired
    private BasicService basicService;

    @GetMapping("/")
    public ResponseEntity<String> returnWelcomeMsg() {
        String message = "Welcome";
        logger.info("Welcome message requested");
        return ResponseEntity.ok().body(message);
    }

    @GetMapping("/exp")
    public ResponseEntity<Double> getExp() {
        logger.info("Calculation started");
        Double result = basicService.exp();
        logger.info("Calculation done");
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/get-errors")
    public ResponseEntity<String> getErrors() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
    }
}
