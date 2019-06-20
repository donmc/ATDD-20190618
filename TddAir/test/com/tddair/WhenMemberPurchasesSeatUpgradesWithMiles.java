package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class WhenMemberPurchasesSeatUpgradesWithMiles {

	private Member member;
	private TddAirApplication app;

	@Before
	public void setup() {

		// Setup
		String username = "bob";
		String email = "bob@improving.com";

		app = new TddAirApplication();
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);

	}

	@Test
	public void shouldUpgradeSeatForRedCatCheckBalanceCase1() {
		member.setBalanceMiles(30000);
		member.setCategory(Category.Red);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(20000, member.getBalanceMiles());
	}

	@Test
	public void shouldUpgradeSeatForRedCatCheckEndUpgradeCase1() {
		member.setBalanceMiles(30000);
		member.setCategory(Category.Red);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(1, member.getSeatUpgrades());
	}

	@Test
	public void shouldUpgradeSeatForRedCatCheckBalanceCase2() {
		member.setBalanceMiles(30000);
		member.setCategory(Category.Red);
		int quantity = 3;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(0, member.getBalanceMiles());
	}

	@Test
	public void shouldUpgradeSeatForRedCatCheckEndUpgradeCase2() {
		member.setBalanceMiles(30000);
		member.setCategory(Category.Red);
		int quantity = 3;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(3, member.getSeatUpgrades());
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldUpgradeSeatForRedCatCheckError() {
		member.setBalanceMiles(30000);
		member.setCategory(Category.Red);
		int quantity = 5;
		member.purchaseSeatUpgrade(quantity);
		fail("Expected exception is not thrown");
	}

	@Test
	public void shouldUpgradeSeatForGreenCatCheckBalanceCase2() {
		member.setBalanceMiles(50000);
		member.setCategory(Category.Green);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(41000, member.getBalanceMiles());
	}

	@Test
	public void shouldUpgradeSeatForGreenCatCheckEndUpgradeCase2() {
		member.setBalanceMiles(50000);
		member.setCategory(Category.Green);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(1, member.getSeatUpgrades());
	}

	@Test
	public void shouldUpgradeSeatForBlueCatCheckBalanceCase2() {
		member.setBalanceMiles(70000);
		member.setCategory(Category.Blue);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(62000, member.getBalanceMiles());
	}

	@Test
	public void shouldUpgradeSeatForBlueCatCheckEndUpgradeCase2() {
		member.setBalanceMiles(70000);
		member.setCategory(Category.Blue);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(1, member.getSeatUpgrades());
	}

	@Test
	public void shouldUpgradeSeatForGoldCatCheckBalanceCase2() {
		member.setBalanceMiles(90000);
		member.setCategory(Category.Golden);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(83000, member.getBalanceMiles());
	}

	@Test
	public void shouldUpgradeSeatForGoldCatCheckEndUpgradeCase2() {
		member.setBalanceMiles(90000);
		member.setCategory(Category.Golden);
		int quantity = 1;
		member.purchaseSeatUpgrade(quantity);
		assertEquals(1, member.getSeatUpgrades());
	}

}
