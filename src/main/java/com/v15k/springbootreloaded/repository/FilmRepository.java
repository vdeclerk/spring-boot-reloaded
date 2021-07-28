package com.v15k.springbootreloaded.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.v15k.springbootreloaded.domain.Film;

public interface FilmRepository extends JpaRepositoryImplementation<Film, Long> {

}
