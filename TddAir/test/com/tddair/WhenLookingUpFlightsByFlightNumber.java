package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class WhenLookingUpFlightsByFlightNumber {

	private TddAirApplication app;
	String flightNumber ;
	Flight flight;
	
	@Before
	public void given() {
		app = new TddAirApplication();
		flightNumber = "AA1290";
		app.addFlight("DFW", "ORD", 1000, "AA", 1290);
		flight = app.lookUpFlightByNumber(flightNumber);
	}
	
	@Test
	public void shouldFindFlightBasedOnFlightNumber() {
		assertNotNull(flight);
	}
	
	@Test
	public void shouldHaveCorrectFlightNumber() {
		assertEquals(flightNumber,flight.getFullFlightNumber());
	}
}
