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
		
		if (email == null || email.indexOf('@') < 0) {
			throw new IllegalArgumentException("Invalid Email Address");
		}
		
		Member newMember = new Member(username, email);
		members.put(username, newMember);
	}

	public Member lookupMemberByUsername(String username) {
		return members.get(username);
	}
}
