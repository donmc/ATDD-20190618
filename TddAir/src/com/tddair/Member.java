package com.tddair;

public class Member {
	
	private String username;
	private String email;
	private int ytdMiles;
	private int balanceMiles;
	private Category category;

	public Member(String username, String email) {
		this.username = username;
		this.email = email;
		this.ytdMiles = 0;
		this.balanceMiles = 10000;
		this.category = Category.Red;
	}

	public Category getCategory() {
		return category;
	}

	public int getYtdMiles() {
		return ytdMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}

	public String getUsername() {
		return username;
	}
	
	public void addMiles(int miles) {
		ytdMiles += miles;
		balanceMiles += miles;
	}
	
	public void refreshCategory() {
		if (ytdMiles < 25000)
			category = Category.Red;
		else if (ytdMiles < 50000)
			category = Category.Green;
		else if (ytdMiles < 75000)
			category = Category.Blue;
		else
			category = Category.Gold;
	}
}
