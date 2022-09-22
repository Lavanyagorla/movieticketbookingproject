package com.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.model.Movie;
import com.movieticketbooking.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;

	// Add Movie
	public Movie save(Movie m) {
		return movieRepository.save(m);
	}

	// Fetch all Movie
	public List<Movie> getMovie() {
		return movieRepository.findAll();
	}

	// Fetch movie by ID
	public Movie findOne(int ID) {
		return movieRepository.getOne(ID);
	}

	// Delete Movie by ID
	public void deleteMovie(Movie m) {
		movieRepository.delete(m);
	}

	// Get Movie list by theater ID
	//public List<Object[]> getMovieBytheaterId(int ID) {
		//return movieRepository.getMovieByTheateID(ID);
	//}

}
