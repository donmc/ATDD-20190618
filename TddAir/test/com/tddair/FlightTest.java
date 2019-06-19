package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {
	private String orig;
	private String dest;
	private int miles;
	private String airline;
	private int number;
	

	@Before
	public void setup() {
		String orig = "DFW";
		String dest = "SFO";
		int miles = 2000;
		String airline = "AA";
		int number = 1290;
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {
		String orig = null;
		new Flight(orig, dest, miles, airline, number);
	}
	
	@Test
	public void testInvalidOrigin() {
		String orig = "X";
		try {
			new Flight(orig, dest, miles, airline, number);
			fail("Should have thrown an IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
	}
	
	@Test
	public void testGetFullFlightNumber() {
		// Setup
		Flight flight = new Flight("DFW", "SFO", 2000, "AA", 1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("AA1290", flightNumber);
	}
	
	@Test
	public void testGetFullFlightNumber_nullAirline() {
		// Setup
		Flight flight = new Flight("DFW", "SFO", 2000, null, 1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN", flightNumber);
	}
	
	@Test
	public void testGetFullFlightNumber_0number() {
		// Setup
		Flight flight = new Flight("DFW", "SFO", 2000, "AA", 0);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN", flightNumber);
	}

}
