package com.develhope.Deploy2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basicController")
public class BasicController {
    @GetMapping("/{num1}/{num2}")
    public Integer somma(@PathVariable Integer num1, @PathVariable Integer num2) {
        return num1 + num2;
    }

}
