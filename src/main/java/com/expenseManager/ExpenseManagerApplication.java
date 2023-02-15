package com.expenseManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.expenseManager.repositories.PersonRepository;

@SpringBootApplication
@EnableMongoRepositories
public class ExpenseManagerApplication {

	@Autowired
	PersonRepository personRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagerApplication.class, args);

	}

	public void testing() {
	}

}
