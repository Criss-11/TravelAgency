package com.example.TravelAgency.model.projection;

import com.example.TravelAgency.model.Trip;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class TripAdditionalServicesReadModel {
    private String description;
    private Set<GroupTripReadModel> trips;

    public TripAdditionalServicesReadModel(Trip source){
        description=source.getDescription();
        trips= source.getAdditionalServices().getTrips().stream()
                .map(GroupTripReadModel::new).collect(Collectors.toSet());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<GroupTripReadModel> getTrips() {
        return trips;
    }

    public void setTrips(Set<GroupTripReadModel> trips) {
        this.trips = trips;
    }
}
