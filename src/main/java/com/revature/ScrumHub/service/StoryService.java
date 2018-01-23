package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.Story;

public interface StoryService {

	public Story getStory(int storyId);
	
	public Story createStory(Story story);

	List<Story> getAllUserStories(int scrumUserId);

	Story updateName(int storyId, String newName);

	void deleteStory(Story story);
	
	
	
}
