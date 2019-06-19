/**
 * 
 */
package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ntangell
 *
 */
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
		member = app.lookupMemberByUsername(username);
	}

	@Test
	public void shouldFindMemberWithSameUserName() {

		// Verify
		assertNotNull(member);
	}

	@Test
	public void shouldHaveRedCategory() {

		// Verify
		assertEquals(Category.Red, member.getCategory());
	}

	@Test
	public void shouldHaveYtdMiles() {

		assertEquals(0, member.getYtdMiles());
	}

	@Test
	public void shouldHaveBalanceMiles() {

		assertEquals(10000, member.getBalanceMiles());
	}

	@Test
	public void shouldFailforDuplicateUsername() {

		String username = "donmc";
		String email = "don@improving.com";
		String message = app.registerMember(username, email);
		assertEquals("username already exists!", message);
	}
	
	@Test
	public void shouldFailforInvalidEmail() {

		String username = "abc";
		String email = "abc.com";
		String message = app.registerMember(username, email);
		assertEquals("Invalid email!", message);
	}
}
