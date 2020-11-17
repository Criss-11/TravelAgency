package com.example.TravelAgency.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "additional_services")
public class TripAdditionalServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Trip's additional services description mast not be empty")
    private String description;
    private int price;
    private boolean available;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @ManyToOne
    @JoinColumn(name = "additional_service_id")
    private Trip trip;

    public TripAdditionalServices() {
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
