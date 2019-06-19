package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FlightTest {
	
	@Before
	public void setup() {
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {
		Flight flight = new Flight(null, "SFO", 200, "AA", 1290);
	}
	
	@Test
	public void testInvalidOrigin() {
		try {
			Flight flight = new Flight("X", "SFO", 2000, "AA", 1290);
			fail("Should have thrown an IllegalArgumentException.");
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
