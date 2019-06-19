package com.tddair;

public class Member {

	private String username;
	private String email;
	private Category category;
	private int ytdMiles;
	private int balanceMiles;

	public int getYtdMiles() {
		return ytdMiles;
	}

	public void setYtdMiles(int ytdMiles) {
		this.ytdMiles = ytdMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}

	public void setBalanceMiles(int balanceMiles) {
		this.balanceMiles = balanceMiles;
	}

	public void setUserName(String inputusername) {
		username = inputusername;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	public int getytdMiles() {
		// TODO Auto-generated method stub
		return ytdMiles;
	}

	public int balanceMiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

	public void setemail(String email2) {
        email = email2;

	}

}
