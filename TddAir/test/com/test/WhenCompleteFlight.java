package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.tddair.Category;
import com.tddair.Member;
import com.tddair.TddAirApplication;

public class WhenCompleteFlight {

	Member member;
	private String username;
	TddAirApplication app;
	@Before
	public void setup() {
		//setup
		username = "bob";
		String email = "bob@improving.com";
		
		app = new TddAirApplication();
		
		//execute
		app.addFlight("ABC", "XYZ", 7490, "QF", 191);
		app.registerMember(username,email);
		member = app.lookUpMemberByUsername(username);

	}
	
	@Test 
	public void shouldGoFromRedToGreen() {
		app.addFlight("111", "222", 20000, "FLIGHT", 20000);
		app.completeFlight("bob","FLIGHT20000");
		app.completeFlight("bob","QF191");
		assertEquals(Category.GREEN, member.getCategory());
	}
	@Test 
	public void shouldGoFromYtd20000To27490() {
		member.addMiles(20000);
		app.completeFlight("bob","QF191");
		assertEquals(27490, member.getYtdMiles());
	}
	@Test 
	public void shouldGoBalFrom30000To37490() {
		member.addMiles(20000);
		app.completeFlight("bob","QF191");
		assertEquals(37490, member.getBalanceMiles());
	}

	@Test 
	public void shouldGoFromGreenToBlue() {
		member.addMiles(45000);
		app.completeFlight("bob","QF191");
		assertEquals(Category.BLUE, member.getCategory());
	}
	@Test 
	public void shouldGoFromYtd45000To52490() {
		member.addMiles(45000);
		app.completeFlight("bob","QF191");
		assertEquals(52490, member.getYtdMiles());
	}
	@Test 
	public void shouldGoBalFrom55000To62490() {
		member.addMiles(45000);
		app.completeFlight("bob","QF191");
		assertEquals(62490, member.getBalanceMiles());
	}

	@Test 
	public void shouldNotGoToBlue() {
		member.addMiles(15000);
		app.completeFlight("bob","QF191");
		assertNotEquals(Category.BLUE, member.getCategory());
	}

}
