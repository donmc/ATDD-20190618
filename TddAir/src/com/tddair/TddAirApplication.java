package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class TddAirApplication {

	private Map<String, Member> members = new HashMap<>();
	FlightDao flights = new FlightDao();

	public TddAirApplication() {
	}

	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		return new Flight("DFW", "ORD", 111, "AA", 11);
	}

	public void registerMember(String username, String email) {

		Member member = new Member(username, email);
		member.setCategory(Category.RED);
		member.setYtdMiles(0);
		member.setBalanceMiles(10000);

		members.put(username, member);

	}

	public Member lookupMemberByUsername(String username) {
		return members.get(username);
	}
}
