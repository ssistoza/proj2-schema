package com.revature.ScrumHub.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.bean.Task;

import com.revature.ScrumHub.repository.TaskRepo;



@Service
public class TaskService {
	
	@Autowired
	TaskRepo taskRepo;
	
	@Autowired
	StoryService storyService;
	
	public Task getTask(int taskId){
		return taskRepo.findOne(taskId);
	}
	
	public Task createTask(Task task){

		Story story = storyService.getStory(task.getStory().getStoryId());
		
		if(story != null)
		{
			task.setStory(story);
			task.setTaskTimestamp(new Timestamp(new Date().getTime()));
			taskRepo.save(task);
			return task;
		}
		else
		{
			return null;
		}
	}

}
