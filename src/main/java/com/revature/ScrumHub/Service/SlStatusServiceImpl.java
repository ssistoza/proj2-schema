package com.revature.ScrumHub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.Repository.SlStatusRepository;
import com.revature.ScrumHub.bean.SlStatus;

@Transactional
@Service
public class SlStatusServiceImpl implements SlStatusService {

	@Autowired
	SlStatusRepository slStatusRepo;
	
	@Override
	public SlStatus getSlStatus (int slStatusId) {
		System.out.println("Service -getSwimlaneStatus");
		return slStatusRepo.findOne(slStatusId);		
	}
	
	@Override
	public SlStatus createSlStatus (SlStatus slStatus) {
		System.out.println("Service -update Swimlane Status");
		slStatusRepo.save(slStatus);
		return slStatus;
	}

}
