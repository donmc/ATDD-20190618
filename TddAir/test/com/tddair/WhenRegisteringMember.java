package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {

	private Member member;

	@Before
	public void setUp() {
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		TddAirApplication app = new TddAirApplication();
		
		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
	}
	
	@Ignore @Test
	public void shouldFindMemberWithSameUserName() {
		// verify
		assertNotNull(member);
	}
	
	@Ignore @Test
	public void shoudHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());
	}
	
	@Ignore @Test
	public void shouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Ignore @Test
	public void shouldHaveBalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
	}
	
	

}
