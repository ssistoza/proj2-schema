package com.revature.ScrumHub.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.bean.BoardMemberId;

@Repository
public interface BoardMemberRepo extends JpaRepository<BoardMember, BoardMemberId>{
	
	public Set<Board> findByBoardMemberId(int scrumUserId);
	public Set<Integer> findBySboard(int boardId);
}
