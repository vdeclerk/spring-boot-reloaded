package com.v15k.springbootreloaded.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.v15k.springbootreloaded.domain.Film;
import com.v15k.springbootreloaded.repository.FilmRepository;

@Service
public class FilmService {

	private FilmRepository repo;
	
	@Autowired
	public FilmService(FilmRepository repo) {
		this.repo = repo;
	}
	
	@Transactional
	public List<Film> films() {
		return repo.findAll(PageRequest.of(0, 20)).toList();
	}
	
	@Transactional
	public Optional<Film> byId(Long id) {
		return repo.findById(id);
	}
}
