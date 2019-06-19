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

	public Object getCategory() {
		
		return m_category;
	}

	public Object getYtdMiles() {
		
		return m_ytdMiles;
	}

	public Object getBalanceMiles() {
		
		return m_balanceMiles;
	}

	public Object getUsername() {
		
		return m_username;
	}

}
