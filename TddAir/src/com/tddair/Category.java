package com.tddair;

public enum Category {
	RED, GREEN, BLUE, GOLD;

	public static Category getCategoryByMiles(int ytdMiles) {
		Category category = Category.RED;
		
		if (ytdMiles >= 25000) category = Category.GREEN;
		if (ytdMiles >= 50000) category = Category.BLUE;
		if (ytdMiles >= 75000) category = Category.GOLD;
		
		return category;
	}


}
