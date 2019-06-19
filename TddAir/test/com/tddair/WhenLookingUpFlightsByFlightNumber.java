package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenLookingUpFlightsByFlightNumber {
	
	private TddAirApplication app;
	private String flightNumber;
	private Flight flight;

	@Before
	public void given() {
		app = new TddAirApplication();
		flightNumber = "AA1290";
		app.addFlight("DFW", "SFO", 2000, "AA", 1290);
		flight = app.lookUpFlightByNumber(flightNumber);
	}

	@Test
	public void shouldFindFlightBasedOnFlightNumber() {
		// verify
		assertNotNull(flight);
	}
	
	@Test
	public void shouldHaveCorrectFlightNumber() {
		assertEquals(flightNumber, flight.getFullFlightNumber());
	}

}
