package com.movieticketbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketbooking.model.City;
import com.movieticketbooking.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
	public List<Theater> findByCity(City ID);
}
