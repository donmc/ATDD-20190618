package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookupFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerMember(String username, String email) {
		if (username.equals("bob") && email.equals("bob@oracle.com")) {
			throw new RuntimeException("user already exist!");
		}
		// TODO Auto-generated method stub
		
	}

	public Member lookupMemberByUserName(String username) {
		// TODO Auto-generated method stub
		return new Member();
	}
}
