package com.example.TravelAgency.adapter;

import com.example.TravelAgency.model.Project;
import com.example.TravelAgency.model.ProjectRepository;
import com.example.TravelAgency.model.TripAdditionalServices;
import com.example.TravelAgency.model.TripAdditionalServicesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer>{
    @Override
    @Query("select distinct p from Project p join fetch p.steps")
    List<Project> findAll();


}
