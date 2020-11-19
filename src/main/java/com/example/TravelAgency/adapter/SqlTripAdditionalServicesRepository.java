package com.example.TravelAgency.adapter;

import com.example.TravelAgency.model.TripAdditionalServices;
import com.example.TravelAgency.model.TripAdditionalServicesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SqlTripAdditionalServicesRepository extends TripAdditionalServicesRepository, JpaRepository<TripAdditionalServices, Integer>{

}
