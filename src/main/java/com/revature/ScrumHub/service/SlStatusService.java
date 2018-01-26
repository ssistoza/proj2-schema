package com.revature.ScrumHub.service;

import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.SlStatus;
import com.revature.ScrumHub.repository.SlStatusRepo;

@Service
public interface SlStatusService {

	public SlStatus getSlStatus (int slStatusId);	
	
	public SlStatus createSlStatus (SlStatus slStatus);	
}
