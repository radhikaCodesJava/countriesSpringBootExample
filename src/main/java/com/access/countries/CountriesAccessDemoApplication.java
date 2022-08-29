package com.access.countries;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.access.countries")
public class CountriesAccessDemoApplication {

	public static void main(String[] args) { 
		sysOutstmnt();
		SpringApplication.run(CountriesAccessDemoApplication.class, args);
	}

	private static void sysOutstmnt() {
		System.out.println("in main method");
	}

}
