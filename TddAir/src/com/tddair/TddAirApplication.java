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

	public String registerMember(String username, String email) {

		Member member = lookupMemberByUsername(username);
		if (member == null)
		{
			if ((email != null) && (email.indexOf('.') != -1) && (email.indexOf('@') != -1))
			{	
				member = new Member(username, email);
				members.put(username, member);
				return "Success";
			}
			else return "Invalid email!";
			
		}
		else
			return "username already exists!";

	}

	public Member lookupMemberByUsername(String username) {
		return members.get(username);
	}

	public void completeFlightForMember(Member member, int startMiles, String flightNo) {
		// TODO Auto-generated method stub
		member.setYtdMiles(startMiles + 7490);
		member.setBalanceMiles(member.getYtdMiles() + member.getBalanceMiles());
		int balanceMiles = member.getBalanceMiles();
		if (balanceMiles > 25000 && balanceMiles < 50000)
			member.setCategory(Category.Green);
		else if (balanceMiles > 50000 && balanceMiles < 75000)
			member.setCategory(Category.Blue);
		else if (balanceMiles > 75000 )
			member.setCategory(Category.Golden);
	}
	
	
}
