package com.v15k.springbootreloaded.repository;

import java.util.List;

import com.v15k.springbootreloaded.domain.Actor;


public interface ActorRepositoryCustom {

	List<Actor> findWithLastnameLike(Character c);

	
}
