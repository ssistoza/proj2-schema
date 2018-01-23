package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.Board;

@Repository
public interface BoardRepo extends JpaRepository<Board, Integer>{
	
}
