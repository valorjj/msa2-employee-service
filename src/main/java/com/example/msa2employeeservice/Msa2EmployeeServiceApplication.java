package com.example.msa2employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Msa2EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msa2EmployeeServiceApplication.class, args);
	}

}
