package com.example.TravelAgency.model.projection;

import com.example.TravelAgency.model.Trip;

import java.time.LocalDateTime;

public class AdditionalServicesTripWriteModel {
    private String destination;
    private String description;
    private int price;
    private LocalDateTime departure;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }
    public Trip toTrip() {
        return new Trip(destination, description, price, departure);
    }
}
