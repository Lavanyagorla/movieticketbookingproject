package com.movieticketbooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int M_id;

	@NotEmpty
	private String M_name;

	@NotEmpty
	private String M_director;

	private String M_rating;

	
	public int getM_id() {
		return M_id;
	}

	public void setM_id(int m_id) {
		M_id = m_id;
	}

	public String getM_name() {
		return M_name;
	}

	public void setM_name(String m_name) {
		M_name = m_name;
	}

	public String getM_director() {
		return M_director;
	}

	public void setM_director(String m_director) {
		M_director = m_director;
	}

	public String getM_rating() {
		return M_rating;
	}

	public void setM_rating(String m_rating) {
		M_rating = m_rating;
	}

}
