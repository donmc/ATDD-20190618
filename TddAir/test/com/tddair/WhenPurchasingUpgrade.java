package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenPurchasingUpgrade {
	Member member;
	
	@Before
	public void setup() {
		TddAirApplication app = new TddAirApplication();
		app.addFlight("SFO", "DFW", 20000, "TST", 20000);
		app.registerMember("donmc", "bob@improving.com");
		member = app.lookupMemberByUserName("donmc");
		app.completeFlight("donmc", "TST20000");
	}
	
	
	@Test
	public void shouldUpgradesGoUP() {
		member.purchaseUpgradesWithMiles(1);
		assertEquals(1, member.getUpgrades());
	}

	@Ignore @Test
	public void shouldBalanceMilesGoDown() {
		member.purchaseUpgradesWithMiles(1);
		assertEquals(20000, member.getBalanceMiles());
	}
}
