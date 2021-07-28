package com.v15k.springbootreloaded.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long actorId;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "actors")
	private Set<Film> films = new HashSet<Film>();
	
	public Long getId() {
		return actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

}
