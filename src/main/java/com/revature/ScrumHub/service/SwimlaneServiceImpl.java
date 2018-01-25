package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.SlStatus;
import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.repository.SwimlaneRepo;


@Service
@Transactional
public class SwimlaneServiceImpl implements SwimlaneService {

	@Autowired
	SwimlaneRepo swimRepo;
	
	@Autowired
	SlStatusService slStatusRepo;

	@Override
	public Swimlane getSwimlane(int slId) {
		return swimRepo.findOne(slId);
	}

	@Override
	public List<Swimlane> getAllSwimlanes(int slId) {
		List<Swimlane> slList = new ArrayList<>();
		return slList;
	}

	@Override
	public Swimlane createSwimlane(Swimlane swimlane) {
		
		SlStatus status = slStatusRepo.getSlStatus(1);
		
		swimlane.setSlStatus(status);
		swimRepo.save(swimlane);
		return swimlane;
	}

	@Override
	public void deleteSwimlane(Swimlane swimlane) {
		swimRepo.delete(swimlane);
	}

}
