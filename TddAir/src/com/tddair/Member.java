package com.tddair;

public class Member {
	String m_username;
	String m_email;
	Category m_category;
	int m_ytdMiles;
	int m_balanceMiles;

	public Member(String username, String email) {
		m_username = username;
		m_email = email;
		m_category = Category.RED;
		m_ytdMiles = 0;
		m_balanceMiles =10000;
	}

	public Category getCategory() {
		
		return m_category;
	}

	public int getYtdMiles() {
		
		return m_ytdMiles;
	}

	public int getBalanceMiles() {
		
		return m_balanceMiles;
	}

	public String getUsername() {
		
		return m_username;
	}

	public void addMiles(int miles) {
		m_ytdMiles += miles;
		m_balanceMiles += miles;
		
	}

}
