package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {
	private Member member;
	private TddAirApplication app;
	
	@Before
	public void setup() {
		// Setup
		String username = "donmc";
		String email = "don@improving.com";
		app = new TddAirApplication();

		// Exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
	}

	@Test
	public void shouldAllowForMultipleMembers() {
		app.registerMember("bob", "bob@improving.com");
		Member firstMember = app.lookupMemberByUserName("donmc");
		Member secondMember = app.lookupMemberByUserName("bob");
		assertNotSame(firstMember, secondMember);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowDuplicateUserName() {
		app.registerMember("donmc", "bob@oracle.com");
		
	}
	
	@Test
	public void shouldFindMemberWithSameUserName() {
		// Verify
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());
	}
	
	@Test
	public void shouldShouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Test
	public void shouldShouldHave10000BalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowInvalidEmail() {
		app.registerMember("don2", "don.com");
	}
	

}
