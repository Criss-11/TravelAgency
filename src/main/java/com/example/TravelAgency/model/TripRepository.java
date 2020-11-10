package com.example.TravelAgency.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.net.ContentHandler;
import java.util.List;
import java.util.Optional;

public interface TripRepository {
    List<Trip> findAll();

    Optional<Trip> findById(Integer id);

    boolean existsById(Integer id);

    Trip save(Trip entity);

    Page<Trip> findAll(Pageable page);

    List<Trip> findByAvailable( boolean available);
}
