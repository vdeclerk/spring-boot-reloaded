package com.v15k.springbootreloaded.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Staff extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long staffId;
	
	private String picture;
	
	@JsonIgnore
	@OneToMany(mappedBy = "staff", 
			   cascade = CascadeType.PERSIST,
			   fetch = FetchType.LAZY)
	private Set<Rental> rentals = new HashSet<Rental>();


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}

	
	public Set<Rental> getRentals() {
		return rentals;
	}


	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
	
}
