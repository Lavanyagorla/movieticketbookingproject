package com.movieticketbooking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieticketbooking.model.Movie;
import com.movieticketbooking.service.MovieService;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    
    //Add Movie
	@PostMapping("/addmovie")
	public Movie createMovie(@Valid @RequestBody Movie m) {
		return movieService.save(m);
	}

    //Get the list of Movie
	@GetMapping("/getmovielist")
	public List<Movie> getMovie(){
		return movieService.getMovie();
	}

    //Get movie by particular ID
	@GetMapping("/getmovie/{ID}")
	public ResponseEntity<Movie> getOneMovie(@PathVariable(value="ID") int ID){
		Movie theMovie = movieService.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(theMovie);
	}

    //update Movie
	@PutMapping("/updatemovie/{ID}")
	public ResponseEntity<Movie> updateMovie(@PathVariable(value="ID") int ID,@Valid @RequestBody Movie m){
		Movie theMovie = movieService.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		theMovie.setM_name(m.getM_name());
		theMovie.setM_director(m.getM_director());
		theMovie.setM_rating(m.getM_rating());
		
		Movie updatedMovie = movieService.save(theMovie);
		return ResponseEntity.ok().body(updatedMovie);
	}

    
    //Delete Movie
	@DeleteMapping("/deletemovie/{ID}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable(value= "ID") int ID){
		Movie theMovie = movieService.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		movieService.deleteMovie(theMovie);
		return ResponseEntity.ok().build();
	}

}
