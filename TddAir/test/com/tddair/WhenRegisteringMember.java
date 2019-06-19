package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {

	private Member member;

	@Before
	public void setup() {
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		TddAirApplication app = new TddAirApplication();
		
		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
	}
	
	@Test
	public void shouldFindMemberWithSameUserName() {
		assertNotNull(member);
	}
	
	@Ignore @Test
	public void shouldShouldHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());
	}
	
	@Ignore @Test
	public void shouldShouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}

	@Ignore @Test
	public void shouldShouldHave10000BalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
	}
}
