package com.Develhope.CustomQueries1.controllers;

import com.Develhope.CustomQueries1.entities.Flight;
import com.Develhope.CustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @PostMapping("/create")
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight){
        return ResponseEntity.ok().body(flightService.createFlight(flight));
    }
}
