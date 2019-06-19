package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCompletingFlight {
	
	private TddAirApplication app;
	private Member member;

	@Before
	public void setup() {
		app = new TddAirApplication();
		
		app.addFlight("SFO", "LAS", 20000, "AA", 100);
		app.addFlight("SFO", "LAX", 7490, "QF", 191);
		app.registerMember("bob", "bob@bob.bob");
		
		member = app.lookupMemberByUsername("bob");
		app.completeFlight("AA100", member.getUsername());
	}

	
	@Test
	public void shouldAccumulateYtdMiles() {
		app.completeFlight("QF191", member.getUsername());
		assertEquals(27490, member.getYtdMiles());
	}
	
	@Test
	public void shoudAccumulateBalanceMiles() {
		app.completeFlight("QF191", member.getUsername());
		assertEquals(37490, member.getBalanceMiles());
	}
	
	@Test
	public void shouldGoFromRedToGreen() {
		app.completeFlight("QF191", member.getUsername());
		assertEquals("Green", member.getCategory().toString());
	}
	
	@Ignore @Test
	public void shouldGoFromGreenToBlue() {
		fail();
	}
	
	@Ignore @Test
	public void shouldGoFromBlueToGold() {
		fail();
	}
	
	@Ignore @Test
	public void shouldStayInRed() {
		fail();
	}
	
	@Ignore @Test
	public void shouldStayInGreen() {
		fail();
	}
	
	@Ignore @Test
	public void shouldStayInBlue() {
		fail();
	}
	
	@Ignore @Test
	public void shouldStayInGold() {
		fail();
	}

}
