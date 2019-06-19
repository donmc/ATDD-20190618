package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test(expected=IllegalArgumentException.class)
	public void testGetFullFlightNumber_nullOrigin() {
		//Setup
		Flight flight = new Flight(null,"SFO", 2000,null,1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		//Verify
		assertEquals("UNKNOWN",flightNumber);
		
	}

	@Test
	public void testGetFullFlightNumber() {
		//Setup
		Flight flight = new Flight("DFW","SFO", 2000,"AA",1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		//Verify
		assertEquals("AA1290",flightNumber);
		
	}

	@Test
	public void testGetFullFlightNumber_nullAirline() {
		//Setup
		Flight flight = new Flight("DFW","SFO", 2000,null,1290);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		//Verify
		assertEquals("UNKNOWN",flightNumber);
		
	}

	@Test
	public void testGetFullFlightNumber_0num() {
		//Setup
		Flight flight = new Flight("DFW","SFO", 2000,"AA",0);
		
		// Execute
		String flightNumber = flight.getFullFlightNumber();
		
		//Verify
		assertEquals("UNKNOWN",flightNumber);
		
	}
}
