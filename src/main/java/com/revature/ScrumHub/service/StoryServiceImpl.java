package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.repository.StoryRepository;

@Service
public class StoryServiceImpl implements StoryService{

	
	@Autowired
	StoryRepository storyRepo;
		
	@Override
	public Story getStory(int storyId) {
		System.out.println("service -getStory");
		return storyRepo.findOne(storyId);		
	}
	
	@Override
	public Story createStory (Story story) {
		System.out.println("Servie -createStory");
		storyRepo.save(story);
		return story;		
	}

	@Override
	public List<Story> getAllUserStories(int scrumUserId) {
		List<Story> allStories = new ArrayList<>();
		return allStories;
	}

	@Override
	public int deleteBoard(int storyId) {
		return 0;
	}
}
