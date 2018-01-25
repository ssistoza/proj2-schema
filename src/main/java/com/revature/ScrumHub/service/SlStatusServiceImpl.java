package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.SlStatus;
import com.revature.ScrumHub.repository.SlStatusRepo;


@Service
@Transactional
public class SlStatusServiceImpl implements SlStatusService {

	@Autowired
	SlStatusRepo slStatusRepo;
	
	@Override
	public SlStatus getSlStatus (int slStatusId) {
		return slStatusRepo.findOne(slStatusId);		
	}
	
	@Override
	public SlStatus createSlStatus (SlStatus slStatus) {
S		slStatusRepo.save(slStatus);
		return slStatus;
	}

}
