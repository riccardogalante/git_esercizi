package com.Develhope.CustomQueries1.controllers;

import com.Develhope.CustomQueries1.entities.Flight;
import com.Develhope.CustomQueries1.enums.EnumStatus;
import com.Develhope.CustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @PostMapping("/create")
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight){
        return ResponseEntity.ok().body(flightService.createFlight(flight));
    }

    @GetMapping("/p1orp2")
    public ResponseEntity<List<Flight>> p1OrP2Flights() {
        List<Flight> flightsOnTime = flightService.findByDoubleStatus(EnumStatus.P1, EnumStatus.P2);
        return ResponseEntity.ok(flightsOnTime);
    }
}
