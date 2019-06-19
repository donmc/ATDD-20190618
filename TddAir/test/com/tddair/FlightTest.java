package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {
		//Setup, Arrange
		
//		try {
			Flight testFlight = new Flight(null, "SFO", 2000, "AA", 101);
			fail("Costructor did not detect invalid origin");
//		}
//		catch(IllegalArgumentException e) {
//			assertEquals("Invalid origin code", e.getMessage());
//		}
	
		
		
		
//		//Exercise, Act
//		String testFlightNumber = testFlight.getFullFlightNumber();
//		
//		//Verify, Assert
//		assertEquals("AA101", testFlightNumber);
		
		
//		fail("Not yet implemented");
	}
	
	@Test
	public void testInvalidOrigin() {
		//Setup, Arrange
		
		try {
			Flight testFlight = new Flight("X", "SFO", 2000, "AA", 101);
			fail("Costructor did not detect invalid origin");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
		//if code were to throw diff xcp- npe, junit will throw error (will not pass/fail)
		// as diff. xcp will bubble up to junit fwk - outside of junit testcase 
		//you could catch all xcp in ur junit tc and mark it as fail
		
		
		
//		//Exercise, Act
//		String testFlightNumber = testFlight.getFullFlightNumber();
//		
//		//Verify, Assert
//		assertEquals("AA101", testFlightNumber);
		
		
//		fail("Not yet implemented");
	}
	

	@Test
	public void testGetFullFlightNumber() {
		//Setup, Arrange
		
		
		Flight testFlight = new Flight("DFW", "SFO", 2000, "AA", 101);
		
		
		
		//Exercise, Act
		String testFlightNumber = testFlight.getFullFlightNumber();
		
		//Verify, Assert
		assertEquals("AA101", testFlightNumber);
		
		
//		fail("Not yet implemented");
	}
	
	@Test
	public void testGetFullFlightNumber_nullAirline() {
		//Setup, Arrange
		
		
		Flight testFlight = new Flight("DFW", "SFO", 2000, null, 101);
		
		
		
		//Exercise, Act
		String testFlightNumber = testFlight.getFullFlightNumber();
		
		//Verify, Assert
		assertEquals("UNKNOWN", testFlightNumber);
		
		
//		fail("Not yet implemented");
	}
	@Test
	public void testGetFullFlightNumber_zeroNumber() {
		//Setup, Arrange
		
		
		Flight testFlight = new Flight("DFW", "SFO", 2000, "AA", 0);
		
		
		
		//Exercise, Act
		String testFlightNumber = testFlight.getFullFlightNumber();
		
		//Verify, Assert
		assertEquals("UNKNOWN", testFlightNumber);
		
		
//		fail("Not yet implemented");
	}
}
