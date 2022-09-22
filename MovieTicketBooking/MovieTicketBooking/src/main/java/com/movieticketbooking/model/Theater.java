package com.movieticketbooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Theater {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int T_id;

	//@NotEmpty
	private String T_name;

	//@NotEmpty
	private String T_area;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "C_id")
	private City city;
	
	Theater(String t_name, String t_area, City t_city) {
		this.T_name = t_name;
		this.T_area = t_area;
		this.city = t_city;
	}

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public String getT_area() {
		return T_area;
	}

	public void setT_area(String t_area) {
		T_area = t_area;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
