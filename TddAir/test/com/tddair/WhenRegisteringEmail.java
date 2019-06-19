package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringEmail {

	private TddAirApplication app;

	@Before
	public void setup() {
		app = new TddAirApplication();
	}

	@Test
	public void shouldThrowErrorForNoAt() {
		try {
			app.registerMember("donmc", "don.com");
			fail();
		} catch (Exception e) {
			assertEquals("Inavlid email!", e.getMessage());
		}
	}

}
