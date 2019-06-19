package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCompleteFlight {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void setup() {

		String username = "donmc";
		String email = "don@improving.com";
		app = new TddAirApplication();

		// Exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUserName("donmc");
	}
	
	@Test
	public void shouldAccumulateYtdMiles() {
		app.addFlight("SFO", "SYD", 20000, "AA", 20000);
		app.completeFlight("donmc","AA20000");
		app.completeFlight("donmc","QF191");
		assertEquals(27490,member.getYtdMiles());
	}
	
	@Test
	public void shouldAccumulateBalanceMiles() {
		app.addFlight("SFO", "SYD", 20000, "AA", 20000);
		app.completeFlight("donmc","AA20000");
		app.completeFlight("donmc","QF191");		
		assertEquals(37490,member.getBalanceMiles());
	}

	@Ignore @Test
	public void shouldGoFromRedToGreen() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void shouldGoFromGreenToBlue() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void shouldGoFromBlueToGold() {
		fail("Not yet implemented");
	}

}
