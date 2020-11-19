package com.example.TravelAgency.model;

import java.util.List;
import java.util.Optional;

public interface TripAdditionalServicesRepository {
    List<TripAdditionalServices> findAll();

    Optional<TripAdditionalServices> findById(Integer id);

    TripAdditionalServices save (TripAdditionalServices entity);
}
