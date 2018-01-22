package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ScrumHub.bean.Board;

public interface BoardRepo extends JpaRepository<Board, Integer>{
	
	// List<ScrumBoard> getAllBoardsBybOwner();
	
}
