package com.example.TravelAgency.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Trip's destination mast not be empty")
    private String destination;
    @NotBlank(message="Trip's description mast not be empty")
    private String description;
    private int price;
    private boolean available;
    private LocalDateTime departure;
    @Embedded
    private Audit audit= new Audit();
    @ManyToOne
    @JoinColumn(name = "additional_service_id")
    private TripAdditionalServices additionalServices;

    public TripAdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(TripAdditionalServices additionalServices) {
        this.additionalServices = additionalServices;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public Trip() {
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void updateFrom(Trip source){
        description=source.description;
        available= source.available;
        departure= source.departure;

    }

}
