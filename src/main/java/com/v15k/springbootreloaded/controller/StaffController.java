package com.v15k.springbootreloaded.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v15k.springbootreloaded.domain.Staff;
import com.v15k.springbootreloaded.service.StaffService;

@RestController
@RequestMapping(path = "staff")
public class StaffController {

	private StaffService service;
	
	public StaffController(StaffService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Staff> all() {
		return service.findAll();
	}
}
