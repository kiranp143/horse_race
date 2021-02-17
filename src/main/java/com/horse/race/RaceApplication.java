package com.horse.race;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class RaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaceApplication.class, args);
	}

}
