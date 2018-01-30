package com.revature.ScrumHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.bean.Task;
import com.revature.ScrumHub.repository.TaskRepo;



@Service
@Transactional
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskRepo taskRepo;
	
	@Autowired
	StoryService storyService;
	
	public Task getTask(int taskId){
		return taskRepo.findOne(taskId);
	}
	
	
	public Task createTask(Task task){
		
		Story story = storyService.getStory(task.getStoryId());
		
		if(story != null)
		{
			
			task.setStoryId(story.getStoryId());
			task.setTaskActive(false);
			
			task = taskRepo.save(task);
			return task;
		}
		else
		{
			return null;
		}
	}
	
	public Task updateTask(Task task)
	{
		boolean dbTaskExists = taskRepo.exists(task.getTaskId());
		
		if(dbTaskExists)
		{
			task = taskRepo.save(task);
			return task;
		}
		else
		{
			return null;
		}
	}
	
	public boolean deleteTask(Task task)
	{
		//check that a task with an ID that matches the parameter ID exists in the DB
		boolean dbTaskExists = taskRepo.exists(task.getTaskId());
		
		if(dbTaskExists)
		{
			
			taskRepo.delete(task);
			return !taskRepo.exists(task.getTaskId());
		}
		else
		{
			return false;
		}
	}

}
