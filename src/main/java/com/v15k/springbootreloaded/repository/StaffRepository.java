package com.v15k.springbootreloaded.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.v15k.springbootreloaded.domain.Staff;

@Repository
public interface StaffRepository extends 
			JpaRepositoryImplementation<Staff, Long>{
	
}
