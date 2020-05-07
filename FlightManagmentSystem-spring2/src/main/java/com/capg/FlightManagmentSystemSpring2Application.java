package com.capg;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.Dao.FlightDao;
import com.capg.entity.Airport;
import com.capg.entity.Flight;
import com.capg.entity.Schedule;
import com.capg.entity.ScheduledFlight;

@SpringBootApplication
public class FlightManagmentSystemSpring2Application implements CommandLineRunner{
	
	@Autowired
	FlightDao flightdao;
	
	public static void main(String[] args) {
		SpringApplication.run(FlightManagmentSystemSpring2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("You are using Flight Management System.");
		
		/*
		Flight flight2 = new Flight(12365,"BS2WW","4162",60);
		Flight flight3 = new Flight(12385,"BS2W2","4561",40);
		
		flightdao.addFlight(flight1);
		flightdao.addFlight(flight2);
		flightdao.addFlight(flight3);
		
		
		Airport airport3 = new Airport("AAhmedabad Airport", "VAAH", "Ahmedabad");
		Airport airport4 = new Airport("Amausi Airport", "VILK", "Lucknow");
		
		flightdao.addAirport(airport1);
		flightdao.addAirport(airport2);
		flightdao.addAirport(airport3);
		flightdao.addAirport(airport4);
		Airport airport1 = new Airport("Bengaluru International Airport", "VOBG", "Bangalore");
		Airport airport2 = new Airport("Bhopal Airport", "VABP", "Bhopal");
		Flight flight1 = new Flight(12355,"BS2WJ","1562",50);
		Schedule schedule1 = new Schedule(1,airport1, airport2, LocalDate.of(2019, 5, 10),LocalDate.of(2019, 5, 11));
		Schedule schedule2 = new Schedule(2,airport3, airport4,LocalDate.of(2019, 5, 10),LocalDate.of(2019, 5, 11));
		
		flightdao.addSchedule(schedule1);
		flightdao.addSchedule(schedule2);
		
		
		//ScheduledFlight sf1 = new ScheduledFlight(2,flight2, 40,schedule2);
		
		
		flightdao.scheduleFlight(sf);
		//flightdao.scheduleFlight(sf1);
		  */

		/*Airport airport1 = new Airport("Bengaluru International Airport", "VOBG", "Bangalore");
		Airport airport2 = new Airport("Bhopal Airport", "VABP", "Bhopal");
		Flight flight1 = new Flight(12355,"BS2WJ","1562",50);
		Schedule schedule1 = new Schedule(1,airport1, airport2, LocalDate.of(2019, 5, 10),LocalDate.of(2019, 5, 11));
		ScheduledFlight sf = new ScheduledFlight(1,flight1, 50, schedule1);
		flightdao.scheduleFlight(sf);*/

		/*Flight flight2 = new Flight(12365,"BS2WW","4162",60);
		Airport airport3 = new Airport("AAhmedabad Airport", "VAAH", "Ahmedabad");
		Airport airport4 = new Airport("Amausi Airport", "VILK", "Lucknow");
		Schedule schedule2 = new Schedule(2,airport3, airport4,LocalDate.of(2019, 5, 10),LocalDate.of(2019, 5, 11));
		flightdao.addSchedule(schedule2);
		ScheduledFlight sf1 = new ScheduledFlight(2,flight2, 40,schedule2);
		flightdao.scheduleFlight(sf1);*/
	}

}
