package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	
	Map<String, Member> mMembers = new HashMap<String, Member>();

	public void addMember(Member member) {
		mMembers.put(member.getUsername(), member);		
	}

	public Member getMemberByName(String username) {		
		return mMembers.get(username);
	}

}
