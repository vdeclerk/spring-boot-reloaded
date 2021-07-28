package com.v15k.springbootreloaded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringBootReloadedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReloadedApplication.class, args);
	}

}
