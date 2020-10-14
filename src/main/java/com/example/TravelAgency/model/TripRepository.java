package com.example.TravelAgency.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface TripRepository extends JpaRepository<Trip, Integer> {
    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Trip trip);

    @RestResource(path = "available", rel = "available")
    List<Trip> findByAvailable(@Param("state") boolean available);
}

