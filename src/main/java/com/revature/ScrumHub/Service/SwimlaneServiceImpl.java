package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.Repository.SwimlaneRepository;
import com.revature.ScrumHub.bean.Swimlane;

@Transactional
@Service
public class SwimlaneServiceImpl implements SwimlaneService {

	@Autowired
	SwimlaneRepository swimRepo;

	@Override
	public Swimlane getSwimlane(int slId) {
		System.out.println("Service -getSwimlane");
		return swimRepo.findOne(slId);
	}

	@Override
	public List<Swimlane> getAllSwimlanes(int slId) {
		List<Swimlane> slList = new ArrayList<>();
		return slList;
	}

	@Override
	public Swimlane createSwimlane(String slName, int slStatusId) {
		System.out.println("Service -create Swimlane");
		Swimlane sl = new Swimlane();		
		sl.setSlName(slName);
		sl.setSlStatusId(slStatusId);
		swimRepo.save(sl);
		return sl;
	}

	@Override
	public void deleteSwimlane(Swimlane swimlane) {
		System.out.println(swimlane.getSlName() + " has been deleted");
		swimRepo.delete(swimlane);
	}

}
