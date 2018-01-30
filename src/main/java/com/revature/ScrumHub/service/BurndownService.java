package com.revature.ScrumHub.service;

import java.sql.Date;
import java.util.Set;

import com.revature.ScrumHub.bean.Burndown;

public interface BurndownService {
	
	public Burndown createBurndown(Burndown bd);
	
	public Burndown getBurndown(Burndown bd);
	
	public Set<Burndown> getBurndowns(int b);

	public Burndown getBurndownByDateAndBoard(int b, Date d);
	
	public Burndown updateBurndown(Burndown bd);
	
	 
}
