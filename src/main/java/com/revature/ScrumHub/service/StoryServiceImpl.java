package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.repository.StoryRepository;

@Transactional
@Service
public class StoryServiceImpl implements StoryService{
	
	@Autowired
	StoryRepository storyRepo;		
	
	@Override
	public Story getStory(int storyId) {
		System.out.println("Service -getStory");
		Story s = new Story();
		s = storyRepo.findOne(storyId);
		return storyRepo.findOne(storyId);		
	}
	
	@Override
	public Story createStory (Story story) {
		System.out.println("Service -createStory");
		storyRepo.save(story);
		return story;		
	}	

	@Override
	public List<Story> getAllUserStories(int scrumUserId) {
		System.out.println("Service -getAllUserStories");
		List<Story> allStories = new ArrayList<>();
		return allStories;
	}
	
	@Override
	public Story updateName(int storyId, String newName) {
		Story s = getStory(storyId);
		s.setStoryName(newName);
		storyRepo.save(s);		
		return s;
	}

	@Override
	public void deleteBoard(Story story) {
		System.out.println(story.getStoryName() + "has been deleted");
		storyRepo.delete(story);
	}	
}
