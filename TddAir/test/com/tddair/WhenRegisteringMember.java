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
		// setup
		String username = "donmc";
		String email = "don@improving.com";
		app = new TddAirApplication();
		
		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username); 
	}
	
	@Test
	public void shouldAllowForMultipleMembers() {
		app.registerMember("bob", "bob@improving.com");
		Member firstMember = app.lookupMemberByUsername("donmc");
		Member secondMember = app.lookupMemberByUsername("bob");
		
		assertNotSame(firstMember, secondMember);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowDuplicateUsername() {
		app.registerMember("donmc", "bob@bob.com");
	}
	
	@Test
	public void shouldFindMemberWithSameUsername() {
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveSameUsername() {
		assertEquals("donmc", member.getUsername());
	}

	@Test
	public void shouldHaveSameEmail() {
		assertEquals("don@improving.com", member.getEmail());
	}
	
	@Test
	public void shouldShouldHaveRedCategory() {
		assertEquals(Category.Red, member.getCategory());
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
		app.registerMember("bob2", "don.com");
	}
}