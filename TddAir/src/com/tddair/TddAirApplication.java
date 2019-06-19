package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	private List<Member> members;
	private HashMap<String,Member> nameToMember;
	
	public TddAirApplication() {
		members = new ArrayList();
		nameToMember = new HashMap();
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		
		return flights.getFlightBy(flightNumber);
	}

	public void registerMember(String username, String email) {
		Member m = new Member(username,email);
		members.add(m);
		nameToMember.put(username, m);
	}

	public Member lookUpMemberByUsername(String username) {
		
		return nameToMember.get(username);
	}
}
