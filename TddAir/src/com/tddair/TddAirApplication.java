package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	Member member;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookupFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		
		 return flights.getFlightBy(flightNumber);
	}

	public void registerMember(String username, String email) {
		if(member == null)
			member = new Member(username, email);
		else {
			if (member.username.equals(username))
				throw new IllegalArgumentException("User already exists!");
			else
				member = new Member(username, email);
		}
			
		
	}

	public Member lookupMemberByUsername(String username) {
		// TODO Auto-generated method stub
		if(member.username.equals(username))
		  return member;
		else
			return null;
	}

	public void completesFlight(String userName, String flightNumber) {
		// TODO Auto-generated method stub
		member = this.lookupMemberByUsername(userName);
		Flight flight = this.lookupFlightByNumber(flightNumber);
		member.completesFlight(flight);
	}



	
}

