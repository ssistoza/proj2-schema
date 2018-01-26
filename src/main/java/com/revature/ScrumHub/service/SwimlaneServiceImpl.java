package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.repository.SwimlaneRepo;

@Transactional
@Service
public class SwimlaneServiceImpl implements SwimlaneService {

	@Autowired
	SwimlaneRepo swimRepo;

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
	public Swimlane createSwimlane(Swimlane swimlane) {
		System.out.println("Service -create Swimlane");
		swimRepo.save(swimlane);
		return swimlane;
	}

	@Override
	public void deleteSwimlane(Swimlane swimlane) {
		System.out.println(swimlane.getSlName() + " has been deleted");
		swimRepo.delete(swimlane);
	}

}
