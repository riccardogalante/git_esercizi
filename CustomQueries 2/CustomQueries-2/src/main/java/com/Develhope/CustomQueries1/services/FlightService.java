package com.Develhope.CustomQueries1.services;

import com.Develhope.CustomQueries1.entities.Flight;
import com.Develhope.CustomQueries1.enums.EnumStatus;
import com.Develhope.CustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
    private ArrayList<Flight> flights=new ArrayList<>();

    public Flight createFlight( Flight flight){
        return  flightRepository.save(flight);
    }
    public List<Flight> findByDoubleStatus(EnumStatus enumToFind, EnumStatus enumToFind2) {
        List<Flight> flightsWithStatus = new ArrayList<>();
        for (Flight flights : flights) {
            if (flights.getStatus() == enumToFind || flights.getStatus() == enumToFind2) {
                flightsWithStatus.add(flights);
            }
        }
        return flightsWithStatus;
    }
}
