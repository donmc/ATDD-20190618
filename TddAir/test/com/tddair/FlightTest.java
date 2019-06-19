/**
 * 
 */
package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ntangell
 *
 */
public class FlightTest {

	private String origin;
	private int number;
	private String airline;
	private int mileage;
	private String destination;

	@Before
	public void setup() {
		
		origin="DFW";
		number=1290;
		airline="AA";
		mileage=1000;
		destination="";

	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullOrigin() {

		new Flight(null, "SFO", 2000, "AA", 1290);
		new Flight(origin, destination, mileage, airline, number);

	}

	@Test
	public void testInvalidOrigin() {

		try {

			new Flight("X", "SFO", 2000, "AA", 1290);
			fail("Should have thrown IllegalrgumentException");

		} catch (IllegalArgumentException e) {
			assertEquals("Inavalid origin code", e.getMessage());
		}

	}

	/**
	 * Test method for
	 * {@link com.tddair.Flight#Flight(java.lang.String, java.lang.String, int, java.lang.String, int)}.
	 */
	@Test
	public void testGetFullFlightNumber() {

		// Set up
		
		Flight flight = new Flight(origin, destination, mileage, airline, number);
		// Execution
		String flightNumber = flight.getFullFlightNumber();
		// Verify
		String expected = "AA1290";
		assertEquals(expected, flightNumber);
	}

	@Test
	public void testGetFullFlightNumber_nullAirline() {

		// Set up
		Flight flight = new Flight("DFW", "SFO", 2000, "AA", 0);
		// Execution
		String flightNumber = flight.getFullFlightNumber();
		// Verify
		String expected = "UNKNOWN";
		assertEquals(expected, flightNumber);
	}

}
