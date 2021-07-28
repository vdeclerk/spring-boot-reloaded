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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storeId;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Staff manager;
	
	@OneToMany
	@JoinColumn(name = "store_id")
	private Set<Staff> staff = new HashSet<Staff>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "store", 
			   cascade = CascadeType.PERSIST,
			   fetch = FetchType.LAZY)
	private Set<Customer> customers = new HashSet<Customer>();
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Address address;
	
	@UpdateTimestamp
	private Instant lastUpdate;

	// Getters and setters
	public Long getId() {
		return storeId;
	}

	public Staff getManager() {
		return manager;
	}

	public void setManager(Staff manager) {
		this.manager = manager;
	}

	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Instant getLastUpdated() {
		return lastUpdate;
	}

	public void setLastUpdated(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
