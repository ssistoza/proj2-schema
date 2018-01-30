package com.revature.ScrumHub.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Burndown;
import com.revature.ScrumHub.repository.BurndownRepo;

@Service
@Transactional
public class BurndownServiceImpl implements BurndownService{

	@Autowired
	BurndownRepo bRepo;
	
	@Override
	public Burndown createBurndown(Burndown bd) {
		bRepo.save(bd);
		return bd;
	}

	@Override
	public Burndown getBurndown(Burndown bd) {
		bd = bRepo.findOne(bd.getBurnId());
		return bd;
	}

	@Override
	public Set<Burndown> getBurndowns(int b) {
		Set<Burndown> bds = new HashSet<>();
		bds = bRepo.findByBoardId(b);
		return bds;
	}

	@Override
	public Burndown getBurndownByDateAndBoard(Date d, int b) {
		Burndown bd = new Burndown();
		bd = bRepo.findByBurnDateAndBoardId(d, b);
		return bd;
	}
	
	@Override
	public Burndown updateBurndown(Burndown bd) {
		Burndown temp = bRepo.findByBurnDateAndBoardId(bd.getBurnDate(), bd.getBoardId());
		
		if (temp != null ) {
			temp.setBurnedPoint(bd.getBurnedPoint());
			temp = bRepo.save(temp);
		}
		
		return temp;
	}
	
}
