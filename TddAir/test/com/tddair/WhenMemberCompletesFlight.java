package com.tddair;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
public class WhenMemberCompletesFlight {
	
	/*
	private int startMiles;
	private String endCategory;
	private int endYtdMiles;
	private int endBalanceMiles;
	private MemberCompletesFlight memberCompletesFlight;
	
	public WhenMemberCompletesFlight(int startMiles, String endCategory, int endYtdMiles, int endBalanceMiles) {
		super();
	 this.startMiles = startMiles;
	 this.endCategory = endCategory;
	 this.endYtdMiles = endYtdMiles;
	 this.endBalanceMiles = endBalanceMiles;

	}
*/
/*
	@Parameters

	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[] { {20000, Green, 27490, 37490} });
	}
*/
	
	private Member member;
	private TddAirApplication app;
	

	@Before
	public void setup() {

		// Setup
		String username = "bob";
		String email = "bob@improving.com";

		app = new TddAirApplication();
		app.registerMember(username, email);
		member = app.lookupMemberByUsername(username);
		member.setYtdMiles(20000);
		app.registerMember("abc1",  "abc1@improving.com");
		member = app.lookupMemberByUsername(username);
		member.setYtdMiles(20000);	
	    int startMiles = 20000;
	    String flightNo = "DDD";
		app.completeFlightForMember(member, startMiles, flightNo);
	}
	
	@Test
	public void shouldUpgradeEndCategory() {
		assertEquals(Category.Green, member.getCategory());

	}

	@Test
	public void shouldUpgradeEndYtd() {
		
		int endYtd = 27490;
		assertEquals(endYtd, member.getYtdMiles());
	}
	

	@Test
	public void shouldUpgradeEndBalance() {
		int balance = 37490;
		assertEquals(balance, member.getBalanceMiles());
	}
}
