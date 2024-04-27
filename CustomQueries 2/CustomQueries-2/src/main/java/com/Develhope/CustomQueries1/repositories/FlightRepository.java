package com.Develhope.CustomQueries1.repositories;

import com.Develhope.CustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
