package com.movieticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.model.Bookings;
import com.movieticketbooking.repository.BookingsRepository;

@Service
public class BookingsService {
     @Autowired
     private BookingsRepository bookingsRepository;
     
    //Get the available seat for the movie 
 	public Bookings getAvailableSeat(int showID) {
 		return bookingsRepository.getOne(showID);
 	}
 	
    //Book the seat 
 	public Bookings bookTheSeat(Bookings book) {
 		return bookingsRepository.save(book);
 	}

}
