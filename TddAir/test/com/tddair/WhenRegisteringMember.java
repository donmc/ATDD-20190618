package com.tddair;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhenRegisteringMember {

	private static Member member;
	private static String username;
	private static String email;
	private static TddAirApplication app;
	
	@BeforeClass
	public static void setup() throws Exception {
		// setup
		username = "donmc";
		email = "don@improving.com";
		app = new TddAirApplication();	
		
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
	
	@Test(expected = Exception.class)
	public void shouldNotAllowDuplicateUserName() throws Exception {
		app.registerMember(username,email);
	}
	
	@Test
	public void shouldCheckForInvalidEmail() {
		
	}
}
