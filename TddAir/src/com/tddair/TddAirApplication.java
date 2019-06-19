package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		return flights.getFlightBy(flightNumber);
	}

	public void registerMember(String username, String email) {
		members.addMember(username, email);
		
	}

	public Member lookupMemberByUsername(String username) {
		return members.getMemberBy(username);
	}
}
 