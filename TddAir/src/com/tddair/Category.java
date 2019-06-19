package com.tddair;

public enum Category {
	RED (0, 25000),
	GREEN (25001, 50000);
	
	
	private int minMiles;
	private int maxMiles;
	Category(int minMiles, int maxMiles) {
		this.minMiles = minMiles;
		this.maxMiles = maxMiles;
	}
	
	public static Category getCategoryForMiles(int miles) {
		for (Category currCategory: Category.values()) {
			if (currCategory.minMiles <= miles && currCategory.maxMiles >= miles) {
				return currCategory;
			}
		}
		
		return null;
	}
}
