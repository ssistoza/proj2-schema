package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.repository.StoryRepo;

@Service
public class StoryService {

	@Autowired
	StoryRepo storyRepo;
		
	public Story getStory(int storyId) {
		System.out.println("service -getStory");
		return storyRepo.findOne(storyId);		
	}
	
	public Story createStory (Story story) {
		System.out.println("Servie -createStory");
		storyRepo.save(story);
		return story;
		
	}
	
}
