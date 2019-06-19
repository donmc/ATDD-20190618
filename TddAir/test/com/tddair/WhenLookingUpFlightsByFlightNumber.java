package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenLookingUpFlightsByFlightNumber {

	
	private Flight flight;
	private TddAirApplication app;
	private String flightNumber;

	@Before
	public void given() {
		TddAirApplication app = new TddAirApplication();
		app.addFlight("DFW", "SFO", 2000, "AA", 1290);
		flightNumber = "AA1290";
		
		flight = app.lookupFlightByNumber(flightNumber);
	}
	
	@Test
	public void shouldFindFlightsBasedOnFlightNumber() {
		
		assertNotNull(flight);
	}

	@Test
	public void shouldHaveCorrectFlightNumber() {
		
		assertEquals(flightNumber, flight.getFullFlightNumber());
	}
}
