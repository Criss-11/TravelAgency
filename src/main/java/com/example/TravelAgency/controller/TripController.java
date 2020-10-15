package com.example.TravelAgency.controller;


import com.example.TravelAgency.model.Trip;
import com.example.TravelAgency.model.TripRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TripController {
    private static final Logger logger = LoggerFactory.getLogger(TripController.class);
    private final TripRepository repository;

    public TripController(TripRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value= "/trips", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Trip>> readAllTrips() {
        logger.warn("Exosing all the trips!");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(value= "/trips")
    ResponseEntity<List<Trip>> readAllTrips(Pageable page) {
        logger.info("Custom page");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }
}
