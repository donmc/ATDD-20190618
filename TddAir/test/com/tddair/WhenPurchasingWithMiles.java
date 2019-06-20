package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingWithMiles {
	
	private Member member;
	private TddAirApplication app;
	
	@Before
	public void setup() {
		String username = "bob";
		String email = "bob@oracle.com";
		
		app = new TddAirApplication();
		
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
		
		
	}
	
	private void preTestSetup(Category category, int startBalanceMiles, int seatUpgrades) {
		member.setCategory(category);
		member.setBalanceMiles(startBalanceMiles);
		member.purchaseSeatUpgrade(seatUpgrades);

	}	
	
	
	

	@Test
	public void RedShouldHaveEndBalance20000() {
		
		preTestSetup(Category.RED, 30000, 1);
		
		assertEquals(20000, member.getBalanceMiles());
	}
	
	@Test
	public void RedShouldHaveEndUpgrades1() {
		
		preTestSetup(Category.RED, 30000, 1);
		
		assertEquals(1, member.getUpgradeQuantity());
	}	
	
	@Test
	public void RedShouldHaveEndBalance30000() {
		
		preTestSetup(Category.RED, 30000, 3);
		
		assertEquals(0, member.getBalanceMiles());
	}
	
	@Test
	public void RedShouldHaveEndUpgrades3() {
		preTestSetup(Category.RED, 30000, 3);
		
		assertEquals(3, member.getUpgradeQuantity());
	}

	
	@Test
	public void RedShouldFailUpgrade() {
		
		
		try {
		preTestSetup(Category.RED, 30000, 5);
		fail("Purcahse Mile Logic not working");
		}	
		catch(InsufficientMilesException ime) {
			assertEquals("Not Enough Miles", ime.getMessage());
		}
	}
	
	@Test
	public void GreenShouldHaveEndBalance31000() {
		
		preTestSetup(Category.GREEN, 40000, 1);
		
		assertEquals(31000, member.getBalanceMiles());
	}
	
	@Test
	public void GreenShouldHaveEndUpgrades1() {
		preTestSetup(Category.GREEN, 40000, 1);
		
		assertEquals(1, member.getUpgradeQuantity());
	}	

	
	@Test
	public void BlueShouldHaveEndBalance62000() {
		
		preTestSetup(Category.BLUE, 70000, 1);
		
		assertEquals(62000, member.getBalanceMiles());
	}
	
	@Test
	public void BlueShouldHaveEndUpgrades1() {
		preTestSetup(Category.BLUE, 70000, 1);
		
		assertEquals(1, member.getUpgradeQuantity());
	}
	
	
	@Test
	public void GoldShouldHaveEndBalance83000() {
		
		preTestSetup(Category.GOLDEN, 90000, 1);
		
		assertEquals(83000, member.getBalanceMiles());
	}
	
	@Test
	public void GoldShouldHaveEndUpgrades1() {
		preTestSetup(Category.GOLDEN, 90000, 1);
		
		assertEquals(1, member.getUpgradeQuantity());
	}	
	
	
}
