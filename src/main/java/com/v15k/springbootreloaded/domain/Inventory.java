package com.v15k.springbootreloaded.domain;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long inventoryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "film_id")
	private Film film;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private Store store;

	@UpdateTimestamp
	private Instant lastUpdate;

	@OneToMany(mappedBy = "inventory", 
			   cascade = CascadeType.PERSIST, 
			   fetch = FetchType.LAZY)
	private Set<Rental> rentals = new HashSet<Rental>();
	
	public Long getId() {
		return inventoryId;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
