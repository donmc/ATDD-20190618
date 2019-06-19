package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerMember(String username, String email) throws DuplicateMemberException {	
		Member member = lookupMemberByUserName(username);
		if( member != null) {
			throw new DuplicateMemberException();
		}
		
		member = new Member(username, email);
		members.addMember(member); 		
	}

	public Member lookupMemberByUserName(String username) {
		return members.getMemberByName(username);
	}

	public void completeFlight(String memberName, String flightNumber) {
		// TODO Auto-generated method stub
		Flight flight = flights.getFlightBy(flightNumber)
	;
		
		Member member = members.getMemberByName(memberName);
		member.addToYTDMiles(flight.getMileage());
		member.addToBalanceMiles(flight.getMileage());
		
		this.updateCategory(member);
		}
	
	
	
	private void updateCategory(Member member) {
		
		if (member.getYTDMiles() <= 25000)
			member.setCategory ( Category.RED);
		else if (member.getYTDMiles() <= 50000)
			member.setCategory(Category.GREEN);
		else if (member.getYTDMiles() <= 75000)
			member.setCategory(Category.BLUE);
		else if (member.getYTDMiles() > 75000)
			member.setCategory(Category.GOLDEN);
	}
}
