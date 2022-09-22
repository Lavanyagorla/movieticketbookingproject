package com.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketbooking.model.Bookings;

public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

}
