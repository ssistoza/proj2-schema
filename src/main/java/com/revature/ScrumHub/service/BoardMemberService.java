package com.revature.ScrumHub.service;

import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.BoardMember;

@Service
public interface BoardMemberService {

	// Create
	public BoardMember createNewBoard(BoardMember bm);
	
	// Retreive
	public BoardMember getBoardMember(int bId, int uId);
	
	// Update
	public BoardMember updateBoardMember(BoardMember bm);
	
	// Delete
	public boolean deleteBoardMember(BoardMember bm);
	
}
