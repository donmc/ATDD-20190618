package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenLookingUpFlights {

	@Test
	public void shouldFindFlightBaedOnFlightNumber() {
		//setup
		TddAirApplication app = new TddAirApplication();
		app.addFlight("DFW","SFO", 2000,"AA",1290);
		String flightNumber = "AA1290";
		//execute
		Flight flight = app.lookUpFlightByNumber(flightNumber);
		//verify
		assertNotNull(flight);
	}

}
