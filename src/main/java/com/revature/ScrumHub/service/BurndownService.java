package com.revature.ScrumHub.service;

import java.util.Date;
import java.util.Set;

import com.revature.ScrumHub.bean.Burndown;

public interface BurndownService {
	
	public Burndown createBurndown(Burndown bd);
	
	public Burndown getBurndown(Burndown bd);
	
	public Set<Burndown> getBurndowns(int b);

	public Burndown getBurndownByDateAndBoard(Date d,int b);
	
	public Burndown updateBurndown(Burndown bd);
	
	 
}
