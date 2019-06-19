package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenCompletingFlight {

	private TddAirApplication app;
	private Member member;
	private String flightNumber;
	private Flight flight;

	@Before
	public void register() {
		app = new TddAirApplication();
		app.registerMember("bob", "bob@bob.com");
		member = app.lookupMemberByUsername("bob");
		flightNumber = "QF191";
	}
	
	@Test
	public void shouldMoveFromRedToGreenCategory() {
		member.setBlanaceMiles(20000);
		//flight = app.lookupFlightByNumber(flightNumber);
		//int miles = flight.getMileage();
		member.completesFlight(flightNumber);
		assertEquals(Category.GREEN, member.getCategory()); 
	}

}
