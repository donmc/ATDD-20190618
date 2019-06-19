package com.tddair;

public class Member {

	private Category category;
	private int ytdMiles;
	private int balanceMiles;
	private String username;
	private String email;

	public Member(String username, String email) {
		this.category = Category.Red;
		this.ytdMiles = 0;
		this.balanceMiles = 10000;
		this.username = username;
		this.email = email;
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
		return this.username;
	}
	
	public String getEmail() {
		return email;
	}

	public void setYtdMiles(int miles) {
		this.ytdMiles=miles;
		
	}

	public void setCategory(Category category) {
		this.category = category;
		
	}

	public void setBalanceMiles(int balanceMiles) {
		this.balanceMiles=balanceMiles;
		
	}

}