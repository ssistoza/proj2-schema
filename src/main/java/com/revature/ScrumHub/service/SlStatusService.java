package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.SlStatus;
import com.revature.ScrumHub.repository.SlStatusRepository;

@Service
public class SlStatusService {

	@Autowired
	SlStatusRepository slStatusRepo;
	
	public SlStatus getSlStatus (int slStatusId) {
		System.out.println("Service -getSwimlaneStatus");
		return slStatusRepo.findOne(slStatusId);		
	}
	
	public SlStatus createSlStatus (SlStatus slStatus) {
		System.out.println("Service -update Swimlane Status");
		slStatusRepo.save(slStatus);
		return slStatus;
	}
	
}
