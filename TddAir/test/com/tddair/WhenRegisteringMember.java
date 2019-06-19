package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRegisteringMember {
	
	private Member member;
	
	@Before
	public void setup() {
		String username = "nparikh";
		String email = "nikhil.parikh@oracle.com";
		
		TddAirApplication app = new TddAirApplication();
		
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

}
