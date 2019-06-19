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
		String username = "nparikh";
		String email = "nikhil.parikh@oracle.com";
		
		app = new TddAirApplication();
		
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
	}

	@Test
	public void shouldFindMemberWithSameUserName() {		
		assertNotNull(member);		
	}
	
	@Test
	public void shouldHaveRedCategory() {
		assertEquals(Category.RED, member.getCategory());			
	}
	
	
	@Test
	public void shouldHave0YTDMiles() {
		assertEquals(0, member.getYTDMiles());		
	}
	
	
	@Test
	public void shouldHave10KBalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());		
	}
	
	@Test
	public void shouldDetectDuplicateUsername() {
		try {
		    app.registerMember("nparikh", "nikhil.parikh@oracle.com");
		    fail("failed to detect duplicate username");
		}
		catch(DuplicateMemberException dme) {
			assertEquals("username already exists", dme.getMessage());
		}
	}
	
	@Test
	public void shouldBeValidEmail() {
		try {
		    app.registerMember("nparikh1", "nikhil.parikh");
		    fail("Invalid email check failed");
		}
		catch(IllegalArgumentException dme) {
			assertEquals("invalid email", dme.getMessage());
		}
	}

}
