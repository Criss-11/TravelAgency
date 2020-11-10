package com.example.TravelAgency.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("trip")
public class TripConfigurationProperties {
    private Template template;

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public static class Template{
        private boolean allowMultipleTrips;

        public boolean isAllowMultipleTrips() {
            return allowMultipleTrips;
        }

        public void setAllowMultipleTrips(boolean allowMultipleTrips) {
            this.allowMultipleTrips = allowMultipleTrips;
        }
    }
}


