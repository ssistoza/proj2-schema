package com.revature.ScrumHub.repository;

import java.sql.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ScrumHub.bean.Burndown;

public interface BurndownRepo extends JpaRepository<Burndown, Integer> {

	public Set<Burndown> findByBoardId(int boardId);
	
	public Burndown findByBurnDateAndBoardId(Date burnDate, int boardId);
}
