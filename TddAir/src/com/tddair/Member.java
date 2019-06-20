package com.tddair;

public class Member {

	private String username;
	private String email;
	private Category category;
	private int ytdMiles;
	private int balanceMiles;
	private int seatUpgrades;

	Member(String username, String email) {

		this.setUsername(username);
		this.setEmail(email);
		this.setCategory(Category.Red);
		this.setYtdMiles(0);
		this.setBalanceMiles(10000);
		this.setSeatUpgrades(0);

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

	public int getSeatUpgrades() {
		return seatUpgrades;
	}

	public void setSeatUpgrades(int seatUpgrades) {
		this.seatUpgrades = seatUpgrades;
	}

	public void purchaseSeatUpgrade(int quantity) {
		
		if (Category.Red == this.getCategory() ) {
		 if (this.getBalanceMiles() >= (10000 * quantity)) {
			 this.setBalanceMiles(this.getBalanceMiles()-(10000 * quantity));
			 this.setSeatUpgrades(quantity);
		 }else {
			 throw new IllegalArgumentException("Insufficient Miles to Purchase Seat Upgrade");
		 }
		}
		if (Category.Green == this.getCategory() ) {
			 if (this.getBalanceMiles() >= (9000 * quantity)) {
				 this.setBalanceMiles(this.getBalanceMiles()-(9000 * quantity));
				 this.setSeatUpgrades(quantity);
			 }else {
				 throw new IllegalArgumentException("Insufficient Miles to Purchase Seat Upgrade");
			 }
			 
			}
		if (Category.Blue == this.getCategory() ) {
			 if (this.getBalanceMiles() >= (8000 * quantity)) {
				 this.setBalanceMiles(this.getBalanceMiles()-(8000 * quantity));
				 this.setSeatUpgrades(quantity);
			 }else {
				 throw new IllegalArgumentException("Insufficient Miles to Purchase Seat Upgrade");
			 } 
			}
		if (Category.Golden == this.getCategory() ) {
			 if (this.getBalanceMiles() >= (7000 * quantity)) {
				 this.setBalanceMiles(this.getBalanceMiles()-(7000 * quantity));
				 this.setSeatUpgrades(quantity);
			 }else {
				 throw new IllegalArgumentException("Insufficient Miles to Purchase Seat Upgrade");
			 } 
			}
	
	}

}
