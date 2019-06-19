package com.tddair;

import java.util.HashMap;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private HashMap<String,Member> members = new HashMap<String,Member>();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		return flights.getFlightBy(flightNumber);
	}

	public void registerMember(String username, String email) {
		if (members.containsKey(username)) {
			throw new IllegalArgumentException("Username already exists.");
		}
		
		if (emailNotValid(email)) {
			throw new IllegalArgumentException("Invalid Email Address");
		}
		
		Member newMember = new Member(username, email);
		members.put(username, newMember);
	}

	private boolean emailNotValid(String email) {
		return email == null || email.indexOf('@') < 0 || email.indexOf('.') < 0;
	}

	public Member lookupMemberByUsername(String username) {
		return members.get(username);
	}

	public void completeFlight(String flightNumber, String username) {
		Flight flight = lookUpFlightByNumber(flightNumber);
		Member member = lookupMemberByUsername(username);
		
		member.addMiles(flight.getMileage());
		member.refreshCategory();
	}
}
