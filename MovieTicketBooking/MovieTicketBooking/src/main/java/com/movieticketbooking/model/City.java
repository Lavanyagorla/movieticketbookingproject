package com.movieticketbooking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int C_id;

	@Column(nullable = false)
	@NotEmpty
	private String C_name;

	@NotEmpty
	private String C_pincode;

	@NotEmpty
	private String C_state;

	@OneToMany
	@JoinColumn(name = "T_id")
	private List<Theater> theater;
	
	City(String c_name, String c_pincode, String c_state) {
		this.C_name = c_name;
		this.C_pincode = c_pincode;
		this.C_state = c_state;
	}

	public int getID() {
		return C_id;
	}

	public void setID(int iD) {
		C_id = iD;
	}

	public String getName() {
		return C_name;
	}

	public void setName(String name) {
		this.C_name = name;
	}

	public String getPincode() {
		return C_pincode;
	}

	public void setPincode(String pincode) {
		this.C_pincode = pincode;
	}

	public String getState() {
		return C_state;
	}

	public void setState(String state) {
		this.C_state = state;
	}

}
