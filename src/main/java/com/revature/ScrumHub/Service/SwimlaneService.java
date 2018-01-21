package com.revature.ScrumHub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.Repository.SwimlaneRepository;
import com.revature.ScrumHub.bean.Swimlane;

@Service
public class SwimlaneService {

	
	@Autowired
	SwimlaneRepository swimRepo;
	
	public Swimlane getSwimlane (int slId) {
		System.out.println("Service -getSwimlane");
		return swimRepo.findOne(slId);
	}
	
	public Swimlane createSwimlane (Swimlane swimlane) {
		System.out.println("Service -create Swimlane");
		swimRepo.save(swimlane);
		return swimlane;
	}
	
}
