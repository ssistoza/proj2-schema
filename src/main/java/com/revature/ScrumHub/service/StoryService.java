package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.Story;

public interface StoryService {

	public Story getStory(int storyId);
	
	public List<Story> getAllUserStories(int scrumUserId);
	
	public Story createStory (Story story);
	
	public Story updateName(int storyId, String newName);
	
	public void deleteBoard(Story story);	
	
}
