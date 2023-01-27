package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories
@SpringBootApplication
public class TechRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechRegApplication.class, args);
	}

}
