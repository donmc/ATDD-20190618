package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {
	Member member;
	private String username;
	TddAirApplication app;
	@Before
	public void setup() {
		//setup
		username = "donmc";
		String email = "don@improving.com";
		
		app = new TddAirApplication();
		
		//execute
		app.registerMember(username,email);
		member = app.lookUpMemberByUsername(username);

	}
	
	@Ignore @Test
	public void shouldNotAllowDuplicate() {
		
	}
	@Test
	public void shouldAllowMultipleMembers() {
		app.registerMember("bob", "bob@improving.com");
		Member first = app.lookUpMemberByUsername("");
		Member second = app.lookUpMemberByUsername("bob");
		assertNotEquals(first, second);
	}
	
	@Test
	public void shouldFindMemberIsNotNull() {
		assertNotNull(member);
		
	}
	@Test
	public void shouldFindMemberWithSameUserName() {
		assertEquals(username, member.getUsername());
		
	}
	
	@Test
	public void shouldHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());
		
	}
	
	@Test
	public void shouldHave0YtdMiles() {
		assertEquals(0,member.getYtdMiles());
		
	}
	
	@Test
	public void shouldHaveBalanceMiles() {
		assertEquals(10000,member.getBalanceMiles());
		
	}

}
