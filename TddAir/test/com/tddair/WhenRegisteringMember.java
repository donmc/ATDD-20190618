package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {

	private Member member;
	private TddAirApplication app;

	@Before
	public void setUp() {
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		app = new TddAirApplication();
		
		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
	}
	
	@Test
	public void shouldFindMemberWithSameUserName() {
		// verify
		assertEquals("donmc", member.getUsername());
	}
	
	@Test
	public void shouldFindSecondMemberWithUserName() {
		String username = "bob";
		String email = "bob@oracle.com";
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
		assertEquals("bob", member.getUsername());
	}
	
	@Test
	public void shouldErrorWhenDuplicateUsername() {
		String username = "donmc";
		String email = "donmc@improving.com";
		
		try {
			app.registerMember(username, email);
			fail("Should throw duplicate username exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Username already exists.", e.getMessage());
		}
	}
	
	@Test
	public void shoudErrorWithInvalidEmail() {
		String username = "bob";
		String email = "bob.com";
		
		try {
			app.registerMember(username, email);
			fail("Should throw invalid email address exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Invalid Email Address", e.getMessage());
		}
	}
	
	@Test
	public void shoudHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());
	}
	
	@Test
	public void shouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Test
	public void shouldHaveBalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
	}
	
}
