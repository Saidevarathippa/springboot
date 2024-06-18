package com.springbootdemo.springboot_firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.firstapp")
@EntityScan("com.firstapp.model")
@SpringBootApplication

public class SpringbootFirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstappApplication.class, args);
	}

}
