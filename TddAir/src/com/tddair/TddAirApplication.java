package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	Member member = null;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookUpFlightByNumber(String flightNumber) {
		return flights.getFlightBy(flightNumber);
	}

	public Member registerMember(String username, String email) {
		if(member != null )
			if(username.equals(member.userName))
					throw new IllegalArgumentException("Duplicate UserName");
		if(!email.contains("@"))
			throw new IllegalArgumentException("Invalid Email");
		member =  new Member(username,email);
		return member;
	}

	public Member lookupMemberByUsername(String username) {
		if(username.equals(member.userName))
			return member;
		else 
			return null;
	}

	public String duplicateUserName(String userName) { 
		if(userName.contentEquals(member.userName))
			return "Duplicate User";
		else 
			{ new Member(userName,null);
			  return "Non Duplicate User";
			}
			
	}
	
	

}
