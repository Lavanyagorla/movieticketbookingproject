package com.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketbooking.model.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
