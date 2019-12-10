package com.example.fight;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.SearchController;
import com.example.entity.FlightDetail;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@ComponentScan(basePackageClasses=SearchController.class)

public class FlightsearchApplication implements CommandLineRunner{

	public static FlightDetail[] flights;
	
	public static void main(String[] args) {
		SpringApplication.run(FlightsearchApplication.class, args);
	}
	@Override
    public void run(String[] args) throws IOException {
		
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        flights = objectMapper.readValue(new File("src/main/resources/flight-sample.json"), FlightDetail[].class);
        for (FlightDetail flight : flights) {
        	System.out.println(flight);
        }
	}
}
