package com.develhope.Interceptor_Middleware_02.controllers;

import com.develhope.Interceptor_Middleware_02.entities.Month;
import com.develhope.Interceptor_Middleware_02.services.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class MonthController {
    @Autowired
    private MonthService monthService;

    @PostMapping("/create")
    public ResponseEntity<Month> createMonth(@RequestBody Month month){
        Month month1= monthService.createMonth(month);
        return ResponseEntity.ok().body(month1);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<Month>> deleteMonth(@RequestParam Long id){
        Optional<Month> month=monthService.deleteById(id);
        return ResponseEntity.ok().body(month);

    }

}
