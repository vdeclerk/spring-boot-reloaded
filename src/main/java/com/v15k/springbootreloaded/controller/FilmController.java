package com.v15k.springbootreloaded.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v15k.springbootreloaded.domain.Film;
import com.v15k.springbootreloaded.service.FilmService;

@RestController
@RequestMapping(path="films")
public class FilmController {

	private FilmService service;
	
	@Autowired
	public FilmController(FilmService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Film> films() {
		return service.films();
	}
	
	@GetMapping(path = "{id}")
	public Optional<Film> film(@PathVariable Long id) {
		return service.byId(id);
	}
}
