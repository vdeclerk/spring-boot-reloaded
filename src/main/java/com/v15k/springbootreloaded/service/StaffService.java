package com.v15k.springbootreloaded.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.v15k.springbootreloaded.domain.Staff;
import com.v15k.springbootreloaded.repository.StaffRepository;

@Service
public class StaffService {

	private StaffRepository repo;
	
	public StaffService(StaffRepository repo) {
		this.repo = repo;
	}
	
	public List<Staff> findAll() {
		return repo.findAll();
	}
}
