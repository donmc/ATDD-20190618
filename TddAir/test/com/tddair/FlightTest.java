package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class FlightTest {
	private String orig;
	private String dest;
	private int miles;
	private String airline;
	private int number;

	@Before
	public void setup() {
		orig = "DFW";
		dest = "SFO";
		miles = 2000;
		airline = "AA";
		number = 1290;
	}
	
	@Test(expected =  IllegalArgumentException.class)
	public void testNullOrigin() {
			new Flight("X",dest,miles,airline,number);	
	}
	
	@Test
	public void testInvalidOrigin() {
		orig = "X";
		try {
			new Flight("X",dest,miles,airline,number);
			fail("Should have thrown illegalArgumentException");
			//error will be thrown only if the exception is not handled --comment the if part in the logic
		}catch(IllegalArgumentException e) {
			assertEquals("Invalid Origin code",e.getMessage());
		}
	}
		
	
	@Test
	public void testGetFullFlightNumber() {
		//Setup
		Flight flight = new Flight(orig,dest,miles,airline,number);
		//Execution
		String flightNumber = flight.getFullFlightNumber();
		//Verify
//		String expected = airline + number; 
//		or you can hardcoded directly AA1290
		assertEquals("AA1290",flightNumber);
		
	}
	
	@Test
	public void testGetFullFlightNumber_nullAirline() {
		airline = null;
		Flight flight = new Flight(orig,dest,miles,airline,number);
		//Execution
		String flightNumber = flight.getFullFlightNumber();
		//Verify
		String expected = airline + number; 
//		or you can hardcoded directly AA1290
		assertEquals("UNKNOWN",flightNumber);
		
	}
	
	@Test
	public void testGetFullFlightNumber_0Airline() {
		//Setup
		number = 0;
		Flight flight = new Flight(orig,dest,miles,airline,number);
		System.out.println("dest" + dest);
		
		//Execution
		String flightNumber = flight.getFullFlightNumber();
		//Verify
		String expected = airline + number; 
//		or you can hardcoded directly AA1290
		assertEquals("UNKNOWN",flightNumber);
		
	}

}
