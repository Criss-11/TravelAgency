package com.example.TravelAgency.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass
abstract class BaseAuditableEntity {
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @PrePersist
    void prePersit(){
        createdOn=LocalDateTime.now();
    }
    @PreUpdate
    void preMerge(){
        updatedOn=LocalDateTime.now();
    }

}
