package com.v15k.springbootreloaded;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.v15k.springbootreloaded.repository.ActorRepository;
import com.v15k.springbootreloaded.repository.CustomerRepository;
import com.v15k.springbootreloaded.repository.FilmRepository;
import com.v15k.springbootreloaded.repository.InventoryRepository;
import com.v15k.springbootreloaded.repository.RentalRepository;
import com.v15k.springbootreloaded.repository.StaffRepository;
import com.v15k.springbootreloaded.repository.StoreRepository;

@SpringBootTest
class SpringBootReloadedFunctionalTests {

	@Autowired private ActorRepository     actorRepo;
	@Autowired private CustomerRepository  customerRepo;
	@Autowired private FilmRepository      filmRepo;
	@Autowired private InventoryRepository inventoryRepo;
	@Autowired private RentalRepository    rentalRepo;
	@Autowired private StaffRepository     staffRepo;
	@Autowired private StoreRepository     storeRepo;
	
	@Test
	void contextLoads() {
		assertThat(actorRepo).isNotNull();
	    assertThat(customerRepo).isNotNull();
	    assertThat(filmRepo).isNotNull();
	    assertThat(inventoryRepo).isNotNull();
	    assertThat(rentalRepo).isNotNull();
	    assertThat(staffRepo).isNotNull();
	    assertThat(storeRepo).isNotNull();
	}
	
	@Test
	void countAll() {
		assertThat(actorRepo.count() > 0);
		assertThat(customerRepo.count() > 0);
		assertThat(filmRepo.count() > 0);
		assertThat(inventoryRepo.count() > 0);
		assertThat(rentalRepo.count() > 0);
		assertThat(staffRepo.count() > 0);
		assertThat(storeRepo.count() > 0);
	}
	
	@Test
	void findAll() {
		assertThat(actorRepo.findAll().size() > 0);
		assertThat(customerRepo.findAll().size() > 0);
		assertThat(filmRepo.findAll().size() > 0);
		assertThat(inventoryRepo.findAll().size() > 0);
		assertThat(rentalRepo.findAll().size() > 0);
		assertThat(staffRepo.findAll().size() > 0);
		assertThat(storeRepo.findAll().size() > 0);
	}

}
