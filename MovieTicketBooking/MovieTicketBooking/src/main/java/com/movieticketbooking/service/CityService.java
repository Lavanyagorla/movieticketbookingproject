package com.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.model.City;
import com.movieticketbooking.repository.CityRepository;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;

    //Add city
	public City save(City c) {
		return cityRepository.save(c);
	}

    //Get the list of  City 
	public List<City> getCity() {
		return cityRepository.findAll();
	}

    //Get City by ID
	public City findOne(int cityID) {
		return cityRepository.getOne(cityID);
	}

	//Update city by ID
	public void update(City c, int Id) {
		cityRepository.save(c);
	}

    //Delete city by ID
	public void deleteCity(City c) {
		cityRepository.delete(c);
	}

}
