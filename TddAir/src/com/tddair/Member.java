package com.tddair;

public class Member {
	
	private String username;
	private String email;

	public Member(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public Category getCategory() {
		return Category.RED;
	}

	public int getYtdMiles() {
		return 0;
	}

	public int getBalanceMiles() {
		return 10000;
	}

	public Object getUsername() {
		return this.username;
	}
}
