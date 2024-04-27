package com.Develhope.CustomQueries1.services;

import com.Develhope.CustomQueries1.entities.Flight;
import com.Develhope.CustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight createFlight( Flight flight){
        return  flightRepository.save(flight);
    }
}
