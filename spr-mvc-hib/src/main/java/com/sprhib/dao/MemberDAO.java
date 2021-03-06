package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Member;

/**
 * 
 * @author deniz.ozen
 *
 */
public interface MemberDAO {
	
	void addMember(Member member);
	void updateMember(Member member);
	Member getMember(int id);
	void deleteMember(int id);
	List<Member> getMembers();

}
