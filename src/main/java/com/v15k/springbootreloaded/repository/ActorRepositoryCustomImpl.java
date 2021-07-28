package com.v15k.springbootreloaded.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.v15k.springbootreloaded.domain.Actor;


public class ActorRepositoryCustomImpl implements ActorRepositoryCustom {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> findWithLastnameLike(Character c) {
		Query query = em.createNativeQuery("SELECT * FROM actor " +
                "WHERE last_name LIKE ?", Actor.class);
        query.setParameter(1, Character.toUpperCase(c) + "%");

        return query.getResultList();
	}

}
