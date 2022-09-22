package com.movieticketbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieticketbooking.model.Bookings;
import com.movieticketbooking.service.BookingsService;

@RestController
public class BookingsController {
	@Autowired
	private BookingsService bookingsService;

    //Get the seat available for a particular Show using the show ID
    @GetMapping("/getshow/{id}")
	public Bookings getAvailableSeat(@PathVariable(value = "id") int id) {
		return bookingsService.getAvailableSeat(id);
	}

    //Book a Seat using the show id By passing the show POJO to the API 
    @PostMapping("show/{id}/bookings")
	public Bookings bookSeatForShow(@PathVariable(value = "id") int id, @Valid @RequestBody Bookings b) {
		return bookingsService.bookTheSeat(b);
	}

}
