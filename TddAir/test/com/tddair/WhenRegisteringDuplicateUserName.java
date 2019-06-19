package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringDuplicateUserName {
private Member member;
private TddAirApplication app;
	
	@Before
	public void setup() {
		// Setup
		String username = "bob";
		String email = "bob@improving.com";
		app = new TddAirApplication();

		// Exercise
		app.registerMember(username, email);
	}
	
	@Test
	public void shouldThrowErrorForDuplicateUser() {
		try {
			app.registerMember("bob", "bob@oracle.com");
			fail();
		} catch (Exception e) {
			assertEquals("user already exist!", e.getMessage());
		}
		
	}

}
