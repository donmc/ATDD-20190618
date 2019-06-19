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

		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);

		flight = app.lookUpFlightByNumber("UA201");

	}

	@Test
	public void shouldGoFromRedToGreen() {

		// Setup

		// Exercise
		app.completeFlightForMember(flight.getFullFlightNumber(), member.getUsername());

		// Verify
        assertEquals(Category.Green, member.getCategory());
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

}
