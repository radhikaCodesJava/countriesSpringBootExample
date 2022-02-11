package com.access.countries;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.access.countries")
public class CountriesAccessDemoApplication {

	
	public static void main(String[] args) {
		System.out.println("in main method");
		SpringApplication.run(CountriesAccessDemoApplication.class, args);
	}

}
