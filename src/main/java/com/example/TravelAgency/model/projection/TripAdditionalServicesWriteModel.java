package com.example.TravelAgency.model.projection;

import com.example.TravelAgency.model.TripAdditionalServices;

import java.util.Set;
import java.util.stream.Collectors;

public class TripAdditionalServicesWriteModel {
    private String description;
    private Set<GroupTripWriteModel> trips;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<GroupTripWriteModel> getTrips() {
        return trips;
    }

    public void setTrips(Set<GroupTripWriteModel> trips) {
        this.trips = trips;
    }

    public TripAdditionalServices toTripAdditionalServices() {
        var result = new TripAdditionalServices();
        result.setDescription(description);
        result.setTrips(
                trips.stream().map(GroupTripWriteModel::toTrip).collect(Collectors.toSet())
        );
        return result;
    }
}
