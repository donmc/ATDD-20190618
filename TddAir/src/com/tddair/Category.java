package com.tddair;

public enum Category {
	RED (10000),
	GREEN (9000),
	BLUE (8000),
	GOLD (7000);
	
	private int milesCost;
	
	Category(int cost){
		this.milesCost = cost;
	}

	public static Category getCategoryForMiles(int miles) {
		Category category = RED;
		
		if (miles >= 25000) {
			category = GREEN;
		} 
		
		if (miles >= 50000) {
			category = BLUE;
		} 

		if (miles >= 75000) {
			category = GOLD;
		}
		
		return category;
	}
	
	public int getMilesCost() {
		return this.milesCost; 
	}
	
}
