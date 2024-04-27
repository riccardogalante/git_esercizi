package com.Develhope.CustomQueries1.repositories;

import com.Develhope.CustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
