package com.example.TravelAgency.model.projection;

import com.example.TravelAgency.model.Trip;

public class AdditionalServicesTripReadModel {
    private String description;
    private boolean available;

    AdditionalServicesTripReadModel(Trip source){
        description=source.getDescription();
        available=source.isAvailable();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
