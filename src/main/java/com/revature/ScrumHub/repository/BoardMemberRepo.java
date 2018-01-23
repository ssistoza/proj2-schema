package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.bean.BoardMemberId;

@Repository
public interface BoardMemberRepo extends JpaRepository<BoardMember, BoardMemberId>{
	

}
