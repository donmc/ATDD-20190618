package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		return new Flight ("DFW","ORD",1000,"AA120",10);
	}

	public void registerMember(String username, String email) {
		// TODO Auto-generated method stub
		
	}

	public Member lookupMemberByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
