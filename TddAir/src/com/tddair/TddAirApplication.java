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
}
