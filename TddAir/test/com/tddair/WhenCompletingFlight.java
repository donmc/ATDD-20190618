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
		member.setStartMiles(20000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(Category.GREEN, member.getCategory()); 
	}
	
	@Test
	public void shouldHaveYtdMiles() {
		member.setStartMiles(20000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(27490, member.getYtdMiles()); 
	}

	@Test
	public void shouldHaveBalanceMiles() {
		member.setStartMiles(20000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(37490, member.getBalanceMiles()); 
	}

	@Test
	public void shouldMoveFromGreenToBlueCategory2() {
		member.setStartMiles(45000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(Category.BLUE, member.getCategory()); 
	}
	
	@Test
	public void shouldHaveYtdMiles2() {
		member.setStartMiles(45000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(52490, member.getYtdMiles()); 
	}

	@Test
	public void shouldHaveBalanceMiles2() {
		member.setStartMiles(45000);
		member.completesFlight(app.lookupFlightByNumber(flightNumber));
		assertEquals(62490, member.getBalanceMiles()); 
	}
	
}
