package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	String orig ="DFW";
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {
		new Flight(null, "SFO", 2000, "AA", 1290);
	}
	
	@Test
	public void testGetFullFlightNumber() {
		// Setup
		Flight flight = new Flight(orig, "SFO", 2000, "AA", 1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("AA1290", flightNumber);
	}

	@Test
	public void testGetFullFlightNumber_nullAirline() {
		// Setup
		Flight flight = new Flight(orig, "SFO", 2000, null, 1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN", flightNumber);
	}

	@Test
	public void testGetFullFlightNumber_zeroNumber() {
		// Setup
		Flight flight = new Flight("DFW", "SFO", 2000, "AA", 0);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN", flightNumber);
	}
	
}
