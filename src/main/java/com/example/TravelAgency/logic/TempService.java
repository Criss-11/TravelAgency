package com.example.TravelAgency.logic;

import com.example.TravelAgency.model.Trip;
import com.example.TravelAgency.model.TripAdditionalServices;
import com.example.TravelAgency.model.TripAdditionalServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TempService {
    @Autowired
    List<String> temp (TripAdditionalServicesRepository repository){
       return repository.findAll()
                .stream()
                .flatMap(TripAdditionalServices->TripAdditionalServices.getTrips().stream())
                .map(Trip::getDescription)
               .collect(Collectors.toList());
    }
}
