package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigion() {
		// Setup
		
		new Flight(null,"SFO",100,"AA",1290);
		
}
	
	@Test
	public void testInvalidOrigion() {
		// Setup
		try {
	
		Flight flight = new Flight("X","SFO",100,"AA",1290);
		fail("Should have thrown Exception");
		} catch (IllegalArgumentException e){
			assertEquals("Invalid origin code",e.getMessage());
		}
}
	
	@Test
	public void testgetFullFlightNumber() {
		// Setup
	
		Flight flight = new Flight("DFW","SFO",100,"AA",1290);
		
		// Execute
		String flightNumber =flight.getFullFlightNumber();
		
		// Verify
		assertEquals("AA1290",flightNumber);
		
		
	}
	
	@Test
	public void testgetFullFlightNumber_nullAirline() {
		// Setup
	
		Flight flight = new Flight("DFW","SFO",100,null,1290);
		
		// Execute
		String flightNumber =flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN",flightNumber);
		
		
	}

	@Test
	public void testgetFullFlightNumber_zeroAirline() {
		// Setup
	
		Flight flight = new Flight("DFW","SFO",100,"AA",0);
		
		// Execute
		String flightNumber =flight.getFullFlightNumber();
		
		// Verify
		assertEquals("UNKNOWN",flightNumber);
		
		
	}
}
