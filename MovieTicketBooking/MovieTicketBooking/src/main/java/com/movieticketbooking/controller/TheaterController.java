package com.movieticketbooking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieticketbooking.model.Movie;
import com.movieticketbooking.model.Theater;
import com.movieticketbooking.service.TheaterService;

@RestController
public class TheaterController {
	@Autowired
	private TheaterService theaterService;

	// Add theater
	@PostMapping("/addtheater")
	public Theater addtheater(@Valid @RequestBody Theater t) {
		return theaterService.save(t);
	}

	// Get theater list
	@GetMapping("/gettheaterlist")
	public List<Theater> getTheater() {
		return theaterService.getTheater();
	}

	// Get theater by particular ID
	@GetMapping("/gettheater/{ID}")
	public ResponseEntity<Theater> getOneTheater(@PathVariable(value = "ID") int ID) {
		Theater thetheater = theaterService.findOne(ID);
		if (thetheater == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(thetheater);
	}

	// Delete theater
	@DeleteMapping("/deletetheater/{ID}")
	public ResponseEntity<Theater> deleteTheater(@PathVariable(value = "ID") int ID) {
		Theater theTheater = theaterService.findOne(ID);
		if (theTheater == null) {
			return ResponseEntity.notFound().build();
		}
		theaterService.deleteTheater(theTheater);
		return ResponseEntity.ok().build();
	}

}
