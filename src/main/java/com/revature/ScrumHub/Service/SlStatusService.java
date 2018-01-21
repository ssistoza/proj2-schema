package com.revature.ScrumHub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.Repository.SlStatusRepository;
import com.revature.ScrumHub.bean.SlStatus;

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
