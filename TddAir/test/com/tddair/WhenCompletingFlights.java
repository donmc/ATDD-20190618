package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCompletingFlights {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void setup() {
		app = new TddAirApplication();
		app.registerMember("donmc", "don@improving.com");
		member = app.lookupMemberByUsername("donmc");
		app.addFlight("DFW", "DFW", 20000, "TST", 20000);
		app.completeFlight("donmc", "TST20000");
		app.completeFlight("donmc", "QF191");
	}
	
	@Test
	public void shouldAccumulateYtdMiles() {
		assertEquals(27490, member.getYtdMiles());
	}

	@Test
	public void shouldAccumulateBalanceMiles() {
		assertEquals(37490, member.getBalanceMiles());
	}
	
	@Test
	public void shouldStayAtRed() {
		app.registerMember("bob", "bob@bob.com");
		app.completeFlight("bob", "QF191");
		Member bob = app.lookupMemberByUsername("bob");
		assertEquals(Category.Red, bob.getCategory());
	}
	
	@Test
	public void shouldGoFromRedToGreen() {
		assertEquals(Category.Green, member.getCategory());
	}
	
	@Test
	public void shouldGoFromGreenToBlue() {
		app.completeFlight("donmc", "TST20000");
		app.completeFlight("donmc", "TST20000");

		assertEquals(Category.Blue, member.getCategory());
	}
	
	@Test
	public void shouldGoFromBlueToGold() {
		app.completeFlight("donmc", "TST20000");
		app.completeFlight("donmc", "TST20000");
		app.completeFlight("donmc", "TST20000");

		assertEquals(Category.Gold, member.getCategory());
	}
}
