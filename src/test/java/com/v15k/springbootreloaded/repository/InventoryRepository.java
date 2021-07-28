package com.v15k.springbootreloaded.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.v15k.springbootreloaded.domain.Inventory;

public interface InventoryRepository 
		extends JpaRepositoryImplementation<Inventory, Long> {

}
