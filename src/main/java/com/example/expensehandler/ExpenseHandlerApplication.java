package com.example.expensehandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExpenseHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseHandlerApplication.class, args);
	}

}
