package com.example.TravelAgency.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
 interface SqlTripRepository extends TripRepository, JpaRepository<Trip, Integer> {
 @Override
 @Query(nativeQuery = true, value = "select count(*)>0 from trips where id=:id")
 boolean existsById(@Param("id") Integer id);
 @Override
 boolean existsByAvailableIsFalseAndAdditionalServices_Id(Integer additionalServiceID);
}

