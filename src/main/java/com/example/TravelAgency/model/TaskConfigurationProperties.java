package com.example.TravelAgency.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("trip")
public class TaskConfigurationProperties {
    private boolean allowMultipleTripsFromTemplate;

    public boolean isAllowMultipleTripsFromTemplate() {
        return allowMultipleTripsFromTemplate;
    }

    public void setAllowMultipleTripsFromTemplate(boolean allowMultipleTripsFromTemplate) {
        this.allowMultipleTripsFromTemplate = allowMultipleTripsFromTemplate;
    }
}


