package com.example.simo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimoApplication.class, args);
	}

}
