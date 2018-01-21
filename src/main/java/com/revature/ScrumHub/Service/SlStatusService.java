package com.revature.ScrumHub.Service;

import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.SlStatus;

@Service
public interface SlStatusService {

	public SlStatus getSlStatus (int slStatusId);	
	
	public SlStatus createSlStatus (SlStatus slStatus);	
}
