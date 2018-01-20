package com.revature.ScrumHub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ScrumHub.bean.ScrumBoard;

public interface ScrumBoardRepo  extends JpaRepository<ScrumBoard, Integer>{
	
	// List<ScrumBoard> getAllBoardsBybOwner();
	
}
