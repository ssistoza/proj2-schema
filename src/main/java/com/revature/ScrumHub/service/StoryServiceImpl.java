package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.repository.StoryRepo;


@Service
@Transactional
public class StoryServiceImpl implements StoryService {
	
	@Autowired
	StoryRepo storyRepo;		
	
	@Override
	public Story getStory(int storyId) {
		Story s = new Story();
		s = storyRepo.findOne(storyId);
		return storyRepo.findOne(storyId);		
	}
	
	@Override
	public Story createStory(Story story) {
		storyRepo.save(story);
		return story;		
	}	

	@Override
	public List<Story> getAllUserStories(int scrumUserId) {
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
	public Story updateStory(Story story) {
		story = storyRepo.save(story);
		return story;
	}
	
	@Override
	public Story reorderStory(Story story){
		
		storyRepo.reorderStory(story.getStoryOrder(), story.getStoryId());
		
		return story;
	}
	
	@Override
	public Story moveStoryToSwimlane(Story story){
		
		storyRepo.moveStoryToSwimlane(story.getStoryOrder(), story.getSlId(), story.getStoryId());
		
		return story;
	}
	
	@Override
	public void deleteStory(Story story) {
		storyRepo.delete(story);
	}	
}
