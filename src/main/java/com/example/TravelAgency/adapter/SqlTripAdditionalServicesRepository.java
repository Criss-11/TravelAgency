package com.example.TravelAgency.adapter;

import com.example.TravelAgency.model.TripAdditionalServices;
import com.example.TravelAgency.model.TripAdditionalServicesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface SqlTripAdditionalServicesRepository extends TripAdditionalServicesRepository, JpaRepository<TripAdditionalServices, Integer>{
    @Override
    @Query("select distinct g from TripAdditionalServices g join fetch g.trips")
    List<TripAdditionalServices> findAll();

    @Override
    boolean existsByAvailableIsFalseAndProject_Id(Integer projectId);
}
