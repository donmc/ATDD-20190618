package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenCompletingFlight {
	
	
	private Member member;
	private TddAirApplication app;
	
	@Before
	public void setup() {
		String username = "bob";
		String email = "bob@oracle.com";
		
		app = new TddAirApplication();
		
		app.registerMember(username, email);
		member = app.lookupMemberByUserName(username);
		
		
	}
	
	private void preTestSetup(int startYTDMiles, int startBalanceMiles) {
		member.setYTDMiles(startYTDMiles);
		member.setBalanceMiles(startBalanceMiles);
		
		String flightNumber = "QF191";

		app.completeFlight(member.getUsername(), flightNumber);
	}

	@Test
	public void shouldPromoteCategoryFromRedToGreen() {
		
		preTestSetup(20000, 30000);
		
		assertEquals(Category.GREEN, member.getCategory());
		
	}
	
	@Test
	public void shouldhave27490YTDMiles() {
		preTestSetup(20000, 30000);
		
		assertEquals(27490, member.getYTDMiles());
	}
	
	@Test
	public void shouldhave37490alanceMiles() {
		preTestSetup(20000, 30000);
		
		assertEquals(37490, member.getBalanceMiles());
	}


	@Test
	public void shouldPromoteCategoryFromGreenToBlue() {
		
		preTestSetup(45000, 55000);
		
		assertEquals(Category.BLUE, member.getCategory());
		
	}
	
	@Test
	public void shouldhave52490YTDMiles() {
		preTestSetup(45000, 55000);
		
		assertEquals(52490, member.getYTDMiles());
	}
	
	@Test
	public void shouldhave62490alanceMiles() {
		preTestSetup(45000, 55000);
		
		assertEquals(62490, member.getBalanceMiles());
	}

	@Test
	public void shouldPromoteCategoryFromBlueToGolden() {
		
		preTestSetup(70000, 80000);
		
		assertEquals(Category.GOLDEN, member.getCategory());
		
	}
	
	@Test
	public void shouldhave77490YTDMiles() {
		preTestSetup(70000, 80000);
		
		assertEquals(77490, member.getYTDMiles());
	}
	
	@Test
	public void shouldhave87490alanceMiles() {
		preTestSetup(70000, 80000);
		
		assertEquals(87490, member.getBalanceMiles());
	}
	
	
	@Test
	public void shouldPromoteCategoryFromRedToRed() {
		
		preTestSetup(15000, 25000);
		
		assertEquals(Category.RED, member.getCategory());
		
	}
	
	@Test
	public void shouldhave22490YTDMiles() {
		preTestSetup(15000, 25000);
		
		assertEquals(22490, member.getYTDMiles());
	}
	
	@Test
	public void shouldhave32490alanceMiles() {
		preTestSetup(15000, 25000);
		
		assertEquals(32490, member.getBalanceMiles());
	}
	
	@Test
	public void shouldPromoteCategoryFromGreenToGreen() {
		
		preTestSetup(40000, 50000);
		
		assertEquals(Category.GREEN, member.getCategory());
		
	}
	
	@Test
	public void shouldhave47490YTDMiles() {
		preTestSetup(40000, 50000);
		
		assertEquals(47490, member.getYTDMiles());
	}
	
	@Test
	public void shouldhave57490alanceMiles() {
		preTestSetup(40000, 50000);
		
		assertEquals(57490, member.getBalanceMiles());
	}
}
