package com.tddair;

public class Member {
	
	String username;
	String email;
	int ytdMiles;
	int balanceMiles;
	Category category;
	
	Member(String username, String email) {
		this.username = username;
		this.email = email;
		ytdMiles = 0;
		balanceMiles = 10000;
		category = Category.RED;
	}
	
	public int getYtdMiles() {
		// TODO Auto-generated method stub
		return ytdMiles;
	}

	public int getBalanceiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

	public Category getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	public void setBlanaceMiles(int i) {
		balanceMiles = i;
	}

	public void completesFlight(Flight flight2) {
		int miles = flight2.getMileage();
		ytdMiles += miles;
		balanceMiles += miles;
		if (ytdMiles >= 25000 && ytdMiles < 50000)
			category = Category.GREEN;
		if (ytdMiles >= 50000 && ytdMiles < 75000)
			category = Category.BLUE;
		if (ytdMiles >= 75000)
			category = Category.GOLD;
	}

	public void setStartMiles(int i) {
		ytdMiles = i;
		balanceMiles += i;
	}

	public int getBalanceMiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

}
