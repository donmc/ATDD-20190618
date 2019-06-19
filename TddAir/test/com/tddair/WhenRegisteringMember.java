package com.tddair;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhenRegisteringMember {

	private static Member member;
	
	@BeforeClass
	public static void setup() {
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		TddAirApplication app = new TddAirApplication();	
		
		// exercise
		app.registerMember(username,email);
		member = app.lookupMemberByUsername(username);
	}
	
	@Test
	public void shouldFindMemberWithSameUserName() {
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());				
	}
	
	@Test
	public void shouldHaveZeroYtdMiles() {
		assertEquals(0, member.getYtdMiles());				
	}	
	
	@Test
	public void shouldHave10000BalanceMiles() {
		assertEquals(10000, member.getBalanceiles());				
	}		
	
}
