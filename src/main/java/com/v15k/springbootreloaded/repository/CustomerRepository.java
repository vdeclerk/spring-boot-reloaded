package com.v15k.springbootreloaded.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.v15k.springbootreloaded.domain.Customer;

public interface CustomerRepository 
		extends JpaRepositoryImplementation<Customer, Long> {

}
