package com.v15k.springbootreloaded.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.v15k.springbootreloaded.domain.Actor;

public interface ActorRepository extends 
			JpaRepositoryImplementation<Actor, Long>,
			ActorRepositoryCustom {

}
