package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingSeatUpgrades {

	private Member member;

	@Before
	public void setup() {
	    member = new Member("bobmc", "bob@improving.com");
		member.completesFlight(new Flight("DFW", "SFO", 20000));
	}
	
	@Test
	public void shouldPurchaseOneSeatUpgrade() {
		
		member.purchaseSeatUpgradeWithMiles(1);
		assertEquals(1,member.getSeatUpgrades());
		assertEquals(20000,member.getBalanceMiles());
	}

	@Test
	public void shouldPurchaseOneSeatUpgrade3() {
		member.purchaseSeatUpgradeWithMiles(3);
		assertEquals(3,member.getSeatUpgrades());
		assertEquals(0,member.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseOneSeatUpgrade5() {
		member.purchaseSeatUpgradeWithMiles(5);
		assertEquals(0,member.getSeatUpgrades());
		assertEquals(30000,member.getBalanceMiles());
	}

	@Test
	public void shouldPurchaseOneSeatUpgradeFromGreen() {
		member.completesFlight(new Flight("DFW", "SFO", 20000));
		member.purchaseSeatUpgradeWithMiles(1);
		assertEquals(1,member.getSeatUpgrades());
		assertEquals(41000,member.getBalanceMiles());
	}

	@Test
	public void shouldPurchaseOneSeatUpgradeFromBlue() {
		member.completesFlight(new Flight("DFW", "SFO", 40000));
		member.purchaseSeatUpgradeWithMiles(1);
		assertEquals(1,member.getSeatUpgrades());
		assertEquals(62000,member.getBalanceMiles());
	}

	@Test
	public void shouldPurchaseOneSeatUpgradeFromGold() {
		member.completesFlight(new Flight("DFW", "SFO", 60000));
		member.purchaseSeatUpgradeWithMiles(1);
		assertEquals(1,member.getSeatUpgrades());
		assertEquals(83000,member.getBalanceMiles());
	}
}
