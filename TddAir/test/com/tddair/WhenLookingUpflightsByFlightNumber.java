package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenLookingUpflightsByFlightNumber {

	private String flightNumber="AA1290";
	private Flight flight;

	@Test
	public void shouldFindFlightBasedOnFlightNumber() {
		TddAirApplication app = new TddAirApplication();
		
		//execute
		Flight flight=app.lookUpFlightByNumber(flightNumber);
		
		//verify
		assertNotNull(flight);
	}

}
