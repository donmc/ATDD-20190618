package com.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps {
	private TddAirApplication app;
	private Member member;
	private String message;

	@When("^customer registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void customer_registers_with_username_and_email(String userName, String email) throws Throwable {
	    try {
	    	app = new TddAirApplication();
	    	app.registerMember(userName, email);
	    }
	    catch (Exception e) {
	    	message = e.getMessage();
	    }
	}

	@Then("^member with username \"([^\"]*)\" exists$")
	public void member_with_username_exists(String userName) throws Throwable {
		member = app.lookupMemberByUsername(userName);
	    assertNotNull(member);
	}

	@Then("^member category is \"([^\"]*)\"$")
	public void member_category_is(String category) throws Throwable {
	    assertEquals(category, member.getCategory().toString());
	}

	@Then("^member ytd miles is (\\d+)$")
	public void member_ytd_miles_is(int ytdMiles) throws Throwable {
		assertEquals(ytdMiles, member.getYtdMiles());
	}

	@Then("^member balance mils is (\\d+)$")
	public void member_balance_mils_is(int balanceMiles) throws Throwable {
		assertEquals(balanceMiles, member.getBalanceMiles());
	}
	
	@Then("^receive error message \"([^\"]*)\"$")
	public void receive_error_message(String message) throws Throwable {
		assertEquals(message, this.message);
	}
}
