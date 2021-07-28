package com.v15k.springbootreloaded.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.*;

@MappedSuperclass
public class Person {

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Address address;
	
	@Email
	private String email;
	
	protected Person() {}
	
	public Person(String firstName, 
			    	String lastName, 
			    	String email) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.email     = email;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
}
