package com.example.TravelAgency.controller;


import com.example.TravelAgency.model.TripRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@RepositoryRestController
public class TripController {
    private static final Logger logger = LoggerFactory.getLogger(TripController.class);
    private final TripRepository repository;


    public TripController(TripRepository repository) {
        this.repository = repository;
    }
    @GetMapping(value= "/trips")
    ResponseEntity<?> readAllTrips() {
        logger.warn("Exosing all the trips!");
        return ResponseEntity.ok(repository.findAll());
    }
}
