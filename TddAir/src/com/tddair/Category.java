package com.tddair;

public enum Category {
	
	RED(10000)
		
	, GREEN(9000), BLUE(8000), GOLDEN(7000);
	
	
	private int mUpgradeMilesCost;

	Category(int upgradeMilesCost){
		setUpgradeMilesCost(upgradeMilesCost);
	}

	public int getUpgradeMilesCost() {
		return mUpgradeMilesCost;
	}

	private void setUpgradeMilesCost(int mUpgradeMilesCost) {
		this.mUpgradeMilesCost = mUpgradeMilesCost;
	}

}
