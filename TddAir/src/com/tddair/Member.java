package com.tddair;

public class Member {

	private String mUsername;
	private String mEmail;
	private Category mCategory;
	private int mBalanceMiles;
	private int mYTDMiles;

	public Member(String username, String email) {
		mUsername = username;
		mEmail = email;
		
		if(isEmailInvalid(email)) {
			throw new IllegalArgumentException("invalid email");
		}
		
		mCategory = Category.RED;
		mBalanceMiles = 10000;
		mYTDMiles = 0;
	}
	
	private boolean isEmailInvalid(String email) {
		return !email.contains("@") || !email.contains(".");
	}
	
	public String getUsername() {
		return mUsername;
	}

	public Object getCategory() {
		return mCategory;
	}

	public int getBalanceMiles() {
		return mBalanceMiles;
	}

	public int getYTDMiles() {
		return mYTDMiles;
	}

}
