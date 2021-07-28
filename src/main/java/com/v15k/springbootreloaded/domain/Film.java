package com.v15k.springbootreloaded.domain;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long filmId;
	
	private String title;
	
	private String description;
	
	private Integer releaseYear;
	
	private Integer length;
	
	private BigDecimal replacementCost;
	
	private String rating;
	
	private String specialFeatures;
	
	private String fulltext;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "film_category",
	   inverseJoinColumns = @JoinColumn(name = "category_id"),
	   joinColumns = @JoinColumn(name = "film_id"))
	private Set<Category> categories = new HashSet<Category>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "film_actor",
	   inverseJoinColumns = @JoinColumn(name = "actor_id"),
	   joinColumns = @JoinColumn(name = "film_id"))
	private Set<Actor> actors = new HashSet<Actor>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Inventory> inventory = new HashSet<Inventory>();
	
	@Transient
	private Duration rentalDuration;
	
	@Transient
	private Double rentalRate;
	
	@UpdateTimestamp
	private Instant lastUpdate;

	public Long getId() {
		return filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public BigDecimal getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getFulltext() {
		return fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	public Duration getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Duration rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
