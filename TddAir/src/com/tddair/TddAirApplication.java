package com.tddair;

public class TddAirApplication {

	private FlightDao flights = new FlightDao();
	private Member member = new Member();

	public TddAirApplication() {
	}

	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		return new Flight("DFW", "ORD", 1000, "AA120", 10);
	}

	public void registerMember(String username, String email) {
     	member.setemail(email);
		member.setUserName(username);
		member.setCategory(Category.RED);
		member.setYtdMiles(0);
		member.setBalanceMiles(10000);
	}

	public Member lookupMemberByUserName(String username) {
		// TODO Auto-generated method stub
		return member;
	}
}
