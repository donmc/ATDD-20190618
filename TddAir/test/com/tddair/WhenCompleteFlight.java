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
		app.addFlight("SFO", "SYD", 20000, "AA", 20000);
		app.addFlight("SFO", "SYD", 45000, "AA", 45000);
		app.addFlight("SFO", "SYD", 70000, "AA", 70000);

		// Exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUserName("donmc");
	}
	
	@Test
	public void shouldAccumulateYtdMiles() {
		app.completeFlight("donmc","AA20000");
		app.completeFlight("donmc","QF191");
		assertEquals(27490,member.getYtdMiles());
	}
	
	@Test
	public void shouldAccumulateBalanceMiles() {
		app.completeFlight("donmc","AA20000");
		app.completeFlight("donmc","QF191");		
		assertEquals(37490,member.getBalanceMiles());
	}

	@Test
	public void shouldGoFromRedToGreen() {
		app.completeFlight("donmc","AA20000");
		app.completeFlight("donmc","QF191");		
		assertEquals(Category.GREEN,member.getCategory());
	}
	
	@Test
	public void shouldGoFromGreenToBlue() {
		app.completeFlight("donmc","AA45000");
		app.completeFlight("donmc","QF191");		
		assertEquals(Category.BLUE,member.getCategory());
	}

	@Test
	public void shouldGoFromBlueToGold() {
		app.completeFlight("donmc","AA70000");
		app.completeFlight("donmc","QF191");		
		assertEquals(Category.GOLD,member.getCategory());
	}

}
