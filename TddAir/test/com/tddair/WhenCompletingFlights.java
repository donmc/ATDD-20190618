package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenCompletingFlights {

	private TddAirApplication app;
	private Member member;
	private Flight flight;

	@Before
	public void setup() {
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		app = new TddAirApplication();
        app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
        flight = app.lookUpFlightByNumber("UA201");
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());

	}

	@Test
	public void shouldGoFromRedToGreen() {

		// Verify
        assertEquals(Category.Green, member.getCategory());
	}
	
	@Test
	public void shouldGoFromGreenToBlue() {
         // Setup 
		flight = app.lookUpFlightByNumber("UA201");
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());
	
		// Verify
        assertEquals(Category.Blue, member.getCategory());
	}
	
	@Test
	public void shouldAccumulateYtdMiles() {

		// Setup
		
		int currentMiles = member.getYtdMiles();

		// Exercise
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());

		// Verify
        assertTrue(currentMiles < member.getYtdMiles());
	}
	
	@Test
	public void shouldAccumulatebalanceMiles() {

		// Setup
		
		int currentMiles = member.getBalanceMiles();

		// Exercise
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());

		// Verify
        assertTrue(currentMiles < member.getBalanceMiles());
	}

}
