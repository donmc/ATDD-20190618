package com.tddair;

public enum Category {
	Red, Green, Blue, Gold;

	public static Category getCategoryFor(int ytdMiles) {
		Category category = Category.Red;
		
		if (ytdMiles >= 25000) category = Category.Green;
		if (ytdMiles >= 50000) category = Category.Blue;
		if (ytdMiles >= 75000) category = Category.Gold;
		
		return category;
	}
}
