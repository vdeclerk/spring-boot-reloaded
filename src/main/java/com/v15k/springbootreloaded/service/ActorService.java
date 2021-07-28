package com.v15k.springbootreloaded.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v15k.springbootreloaded.domain.Actor;
import com.v15k.springbootreloaded.repository.ActorRepository;

@Service
public class ActorService {

	private ActorRepository repo;
	
	@Autowired
	public ActorService(ActorRepository repo) {
		this.repo = repo;
	}
	
	public List<Actor> all() {
		return repo.findAll();
	}
	
	public Actor create(Actor actor) {
		return repo.save(actor);
	}
	
	public List<Actor> findLastnameWith(Character initial) {
		return repo.findWithLastnameLike(initial);
	}

}
