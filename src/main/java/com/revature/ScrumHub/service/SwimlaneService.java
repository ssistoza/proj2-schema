package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.repository.SwimlaneRepo;

public interface SwimlaneService {

	public Swimlane getSwimlane (int slId);
	
	public List<Swimlane> getAllSwimlanes(int slId);
	
	public Swimlane createSwimlane (Swimlane swimlane);
	
	public void deleteSwimlane (Swimlane swimlane);
}
