package com.v15k.springbootreloaded.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v15k.springbootreloaded.domain.Actor;
import com.v15k.springbootreloaded.service.ActorService;

@RestController
@RequestMapping(path = "actor")
public class ActorController {
	
	private ActorService service;
	
	@Autowired
	public ActorController(ActorService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Actor> all() {
		return service.all();
	}

	@PostMapping
	public Actor add(@RequestBody Actor actor) {
		return service.create(actor);
	}
	
	@GetMapping(path = "{initial}")
	public List<Actor> findInitial(@PathVariable("initial") Character initial) {
		return service.findLastnameWith(initial);
	}
}