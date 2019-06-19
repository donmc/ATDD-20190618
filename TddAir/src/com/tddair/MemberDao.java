package com.tddair;

import java.util.HashMap;
import java.util.Map;
 
public class MemberDao {

	private Map<String, Member> members = new HashMap<String, Member>();
	
	public void addMember(String username, String email) {
		if (members.containsKey(username)) throw new IllegalArgumentException("username already exists!");
		
		if (emailIsNotValid(email))  throw new IllegalArgumentException("invalid email!");
		
		members.put(username, new Member(username, email)); 
	}

	private boolean emailIsNotValid(String email) {
		return !email.contains("@") || !email.contains(".");
	}

	public Member getMemberBy(String username) {
		return members.get(username);
	}

}