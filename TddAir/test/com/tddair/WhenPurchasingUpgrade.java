package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenPurchasingUpgrade {
	Member member;
	private TddAirApplication app;
	
	@Before
	public void setup() {
		app = new TddAirApplication();
		app.addFlight("SFO", "DFW", 10000, "TST", 10000);
		app.addFlight("SFO", "DFW", 20000, "TST", 20000);
		app.addFlight("SFO", "DFW", 30000, "TST", 30000);
		app.registerMember("donmc", "bob@improving.com");
		member = app.lookupMemberByUserName("donmc");
		app.completeFlight("donmc", "TST20000");
	}
	
	
	@Test
	public void shouldUpgradesGoUP() {
		member.purchaseUpgradesWithMiles(1);
		assertEquals(1, member.getUpgrades());
	}

	@Test
	public void shouldBalanceMilesGoDown() {
		member.purchaseUpgradesWithMiles(1);
		assertEquals(20000, member.getBalanceMiles());
	}
	
	
	
	@Test
	public void shouldCostBe9000ForGreen() {
		app.completeFlight("donmc", "TST10000");
		member.purchaseUpgradesWithMiles(1);
		assertEquals(31000, member.getBalanceMiles());
		
	}
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldErrorForNotEligible() {
		member.purchaseUpgradesWithMiles(5);
	}
}
