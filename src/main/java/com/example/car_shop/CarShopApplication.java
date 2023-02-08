package com.example.car_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CarShopApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarShopApplication.class, args);
	}
}
