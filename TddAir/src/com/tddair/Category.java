package com.tddair;

public enum Category {
	RED,
	GREEN,
	BLUE,
	GOLD;
	
	
	
	public static Category getCategoryForMiles(int miles) {
		Category category = null;
		
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
}
