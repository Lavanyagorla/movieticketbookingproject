package com.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.model.City;
import com.movieticketbooking.model.Theater;
import com.movieticketbooking.repository.TheaterRepository;

@Service
public class TheaterService {
	@Autowired
	private TheaterRepository theaterRepository;

	// Add Theater
	public Theater save(Theater t) {
		return theaterRepository.save(t);
	}

	// Get the list of theaters
	public List<Theater> getTheater() {
		return theaterRepository.findAll();
	}

	// Get Theater by ID
	public Theater findOne(int ID) {

		return theaterRepository.getOne(ID);

	}

	// Delete theater by ID
	public void deleteTheater(Theater t) {
		theaterRepository.delete(t);
	}

}
