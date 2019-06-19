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
	
	public RegisterMemberSteps() {
		app = new TddAirApplication();
	}
	
	@When("^customer registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void customer_registers_with_username_and_email(String username, String email) throws Throwable {
	    try {
	    	app.registerMember(username, email);
	    } catch (Exception e) {
	    	message = e.getMessage();
	    }
	}

	@Then("^member with username \"([^\"]*)\" exists$")
	public void member_with_username_exists(String username) throws Throwable {
		member = app.lookupMemberByUserName(username);
		assertNotNull(member);
	}

	@Then("^member category is \"([^\"]*)\"$")
	public void member_category_is(String category) throws Throwable {
	    assertEquals(category, member.getCategory().toString());
	}

	@Then("^member Ytd Miles is (\\d+)$")
	public void member_Ytd_Miles_is(int ytdMiles) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(ytdMiles, member.getYtdMiles());
	}

	@Then("^member balance miles is (\\d+)$")
	public void member_balance_miles_is(int balanceMiles) throws Throwable {
	    assertEquals(balanceMiles, member.getBalanceMiles());
	}

	@Then("^receive error message \"([^\"]*)\"$")
	public void receive_error_message(String expectedMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(expectedMessage, this.message);
	}
}
