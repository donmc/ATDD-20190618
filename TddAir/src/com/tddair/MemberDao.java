package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private Map<String, Member> members = new HashMap<String, Member>();

	public void addMember(String username, String email) {
		if (members.containsKey(username)) {
			throw new IllegalArgumentException("user already exist!");
		}
		
		if (emailIsNotValid(email)) {
			throw new IllegalArgumentException("Inavlid email!");
		}
		
		members.put(username, new Member(username, email));
		
	}

	private boolean emailIsNotValid(String email) {
		return !email.contains("@") || !email.contains(".");
	}

	public Member getMemberBy(String username) {
		// TODO Auto-generated method stub
		return members.get(username);
	}

}
