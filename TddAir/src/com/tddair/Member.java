package com.tddair;

public class Member {
	
	String username;
	String email;
	int ytdMiles;
	int balanceMiles;
	Category category;
	int seatUpgrades;
	
	public int getSeatUpgrades() {
		return seatUpgrades;
	}

	public void setSeatUpgrades(int seatUpgrades) {
		this.seatUpgrades = seatUpgrades;
	}

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
		
		category = Category.getCategoryByMiles(ytdMiles);
	}


	public void setStartMiles(int i) {
		ytdMiles = i;
		balanceMiles += i;
	}

	public int getBalanceMiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

	public void purchaseSeatUpgradeWithMiles(int qtyUpgrades) {
		int purchaseCost = Category.getPurchaseMiles(this.getCategory());
		if (purchaseCost*qtyUpgrades <= balanceMiles) {
		this.balanceMiles -= (purchaseCost * qtyUpgrades); 
		this.seatUpgrades += qtyUpgrades;
		}
	}

}
