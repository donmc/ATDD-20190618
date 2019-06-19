package com.tddair;

public class Member {

	private String username;
	private String email;
	private Category category;
	private int ytdMiles;
	private int balanceMiles;

	Member(String username, String email) {

		this.setUsername(username);
		this.setEmail(email);
		this.setCategory(Category.Red);
		this.setYtdMiles(0);
		this.setBalanceMiles(10000);

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

	public void setCategory(Category category) {
		this.category = category;

	}

	public void setYtdMiles(int ytdMiles) {
		this.ytdMiles = ytdMiles;
		
	}

	public void setBalanceMiles(int balanceMiles) {
		this.balanceMiles = balanceMiles;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
