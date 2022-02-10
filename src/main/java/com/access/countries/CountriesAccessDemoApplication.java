package com.access.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.access.countries.service")
@SpringBootApplication(scanBasePackages = "com.access.countries")
public class CountriesAccessDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CountriesAccessDemoApplication.class, args);
	}

}
