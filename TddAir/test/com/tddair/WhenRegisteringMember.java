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

	@Before
	public void setup() {

		// Setup
		String username = "donmc";
		String email = "don@improving.com";

		TddAirApplication app = new TddAirApplication();

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
		assertEquals(Category.RED, member.getCategory());
	}

	@Test
	public void shouldHaveYtdMiles() {

		assertEquals(0, member.getYtdMiles());
	}

	@Test
	public void shouldHaveBalanceMiles() {

		assertEquals(10000, member.getBalanceMiles());
	}

}
