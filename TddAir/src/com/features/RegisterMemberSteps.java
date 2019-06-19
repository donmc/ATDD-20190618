package com.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps {
	@When("^customer registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void customer_registers_with_username_and_email(String username, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^member with username \"([^\"]*)\" exists$")
	public void member_with_username_exists(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^member category is \"([^\"]*)\"$")
	public void member_category_is(String category) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^member ytd miles is (\\d+)$")
	public void member_ytd_miles_is(int ytdMiles) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^member balance miles is (\\d+)$")
	public void member_balance_miles_is(int balanceMiles) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^receive error message \"([^\"]*)\"$")
	public void receive_error_message(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
