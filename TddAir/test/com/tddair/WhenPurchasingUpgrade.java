package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
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
	public void shouldBalanceGoDown() {
		member.purchaseUpgradesWithMiles(1);
		assertEquals(1, member.getUpgrades());
	}

}
