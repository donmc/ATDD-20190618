/**
 * 
 */
package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ntangell
 *
 */
public class WhenLookingupFlightsByFlightNumber {

	String flightNumber;
	Flight flight;
	private String origin;

	@Before
	public void given() {

		TddAirApplication app = new TddAirApplication();
		flightNumber = "AA1290";
		
		flight = app.lookUpFlightByNumber(flightNumber);

	}

	@Test
	public void shouldFindFlightBasedOnFlightNumber() { 
		
		// Verify
		assertNotNull(flight);
		
	}

	@Test
	public void shouldHaveCorrectFlightNumber() {

		// Verify
		assertEquals(flightNumber, flight.getFullFlightNumber());

	}

	@Test
	public void shouldHaveCorrectOrigin() {
		
		// Verify
		assertEquals(origin, flight.getOrigin());

	}

}
