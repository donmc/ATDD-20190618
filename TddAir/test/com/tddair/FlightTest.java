package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {
	
	private String dest;
	private int miles;
	private String airline;
	private int number;
	private String orig;

	@Before
	public void setup() {
		orig = "DFW";
		dest = "SFO";
		miles = 2000;
		airline = "AA";
		number = 1290;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {

		new Flight(null, dest, miles, airline, number);
	}

	@Test
	public void testInvalidOrigin() {

		try {
			new Flight("X", dest, miles, airline, number);
			fail("Should have thrown an IllegalArgumentException!");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
	}

	@Test
	public void testGetFullFlightNumber() {

		Flight flight = new Flight(orig, dest, miles, airline, number);

		// Execute
		String flightNumber = flight.getFullFlightNumber();

		// Verify
		String expected = "AA1290";
		assertEquals(expected, flightNumber);
	}

	@Test
	public void testGetFullFlightNumber_nullAirline() {
		// Setup

		Flight flight = new Flight(orig, dest, miles, null, number);

		// Execute
		String flightNumber = flight.getFullFlightNumber();

		// Verify
		String expected = "UNKNOWN";
		assertEquals(expected, flightNumber);
	}

	@Test
	public void testGetFullFlightNumber_0number() {
		// Setup
 
		Flight flight = new Flight(orig, dest, miles, airline, 0);

		// Execute
		String flightNumber = flight.getFullFlightNumber();

		// Verify
		String expected = "UNKNOWN";
		assertEquals(expected, flightNumber);
	}

}
