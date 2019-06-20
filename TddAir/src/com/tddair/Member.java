package com.tddair;

import org.junit.Test;

public class Member {

	private Category category;
	private int ytdMiles;
	private int balanceMiles;
	private String username;
	private String email;

	public Member(String username, String email) {
		this.category = Category.RED;
		this.ytdMiles = 0;
		this.balanceMiles = 10000;
		this.username = username;
		this.email = email;
	}

	public String getUserName() {
		return username;
	}

	public Category getCategory() {
		return category;
	}

	public int getYtdMiles() {
		return ytdMiles;
	}

	public int getBalanceMiles() {
		return this.balanceMiles;
	}

	public String getEmail() {
		return email;
	}
	
	private void addYtdMiles(int milesToAdd) {
		this.ytdMiles += milesToAdd;
		
		this.category = Category.getCategoryForMiles(this.ytdMiles);
	}

	private void addBalanceMiles(int mileage) {
		this.balanceMiles += mileage;
	}

	public void completeFlight(Flight flight) {
		addYtdMiles(flight.getMileage());
		addBalanceMiles(flight.getMileage());
	}

	public void purchaseUpgradesWithMiles(int i) {
		// TODO Auto-generated method stub
		
	}

	public int getUpgrades() {
		// TODO Auto-generated method stub
		return -1;
	}
}
