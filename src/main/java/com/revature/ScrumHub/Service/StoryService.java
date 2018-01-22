package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.Repository.StoryRepository;
import com.revature.ScrumHub.bean.Story;

@Service
public class StoryService {

	@Autowired
	StoryRepository storyRepo;
		
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
