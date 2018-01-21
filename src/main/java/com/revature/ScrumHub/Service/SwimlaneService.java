package com.revature.ScrumHub.Service;

import java.util.List;

import com.revature.ScrumHub.bean.Swimlane;

public interface SwimlaneService {

	public Swimlane getSwimlane (int slId);
	
	public List<Swimlane> getAllSwimlanes(int slId);
	
	public Swimlane createSwimlane (Swimlane swimlane);
	
	public void deleteSwimlane (int slId);
}
