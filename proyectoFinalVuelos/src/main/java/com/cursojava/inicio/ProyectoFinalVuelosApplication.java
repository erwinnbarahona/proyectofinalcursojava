package com.cursojava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan (basePackages = "com.cursojava.models")
@EnableJpaRepositories (basePackages = "com.cursojava.dao")
@SpringBootApplication (scanBasePackages = {"com.cursojava.controller", "com.cursojava.services"})
public class ProyectoFinalVuelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalVuelosApplication.class, args);
	}
	
}
