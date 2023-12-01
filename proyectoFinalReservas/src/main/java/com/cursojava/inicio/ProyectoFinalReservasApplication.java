package com.cursojava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan (basePackages = "com.cursojava.models")
@EnableJpaRepositories (basePackages = "com.cursojava.dao")
@SpringBootApplication (scanBasePackages = {"com.cursojava.controller", "com.cursojava.services"})
public class ProyectoFinalReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalReservasApplication.class, args);
	}

	@Bean
	public RestTemplate template(){

		return new RestTemplate();
	}
	
}
