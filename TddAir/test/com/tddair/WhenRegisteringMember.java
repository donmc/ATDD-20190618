package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {

	private Member member;

	@Before
	public void setup() {
		String username = "skarimis";
		String email = "srikanth.karimisetty@oracle.com";
		TddAirApplication app = new TddAirApplication();

		// exercise
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
	}

	@Test
	public void shouldFindMemberwithSameUserName() {
		assertNotNull(member);

	}


	@Test
	public void shouldHaveRedCategory() {
		// Verify
		assertEquals(Category.RED, member.getCategory());

	}


	@Test
	public void shouldHave0ytdMiles() {
		// Verify
		 assertEquals(0,member.getytdMiles());

	}

	
	@Test
	public void shouldHave10000balanceMiles() {
		// Verify
		assertEquals(10000,member.balanceMiles());

	}
}
