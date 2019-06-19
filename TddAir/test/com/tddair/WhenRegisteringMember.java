package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {
	private Member member;
	
	@Before
	public void setup() {
		// Setup
		String username = "donmc";
		String email = "don@improving.com";
		TddAirApplication app = new TddAirApplication();

		// Exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
	}

	@Test
	public void shouldFindMemberWithSameUserName() {
		// Verify
		assertNotNull(member);
	}
	
	@Ignore @Test
	public void shouldHaveRedCategory() {
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
