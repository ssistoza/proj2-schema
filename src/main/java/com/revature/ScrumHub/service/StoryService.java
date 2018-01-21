package com.revature.ScrumHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.repository.StoryRepository;

public interface StoryService {

	public Story getStory(int storyId);
	
	public List<Story> getAllUserStories(int scrumUserId);
	
	public Story createStory (Story story);
	
	public int deleteBoard(int storyId);
	
}
