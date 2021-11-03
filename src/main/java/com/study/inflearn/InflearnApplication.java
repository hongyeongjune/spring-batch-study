package com.study.inflearn;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class InflearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(InflearnApplication.class, args);
	}

}
