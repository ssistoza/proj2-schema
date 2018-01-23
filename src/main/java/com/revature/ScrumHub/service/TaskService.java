package com.revature.ScrumHub.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.bean.Task;

import com.revature.ScrumHub.repository.TaskRepo;



@Service
@Transactional
public class TaskService {
	
	@Autowired
	TaskRepo taskRepo;
	
	@Autowired
	StoryService storyService;
	
	public Task getTask(int taskId){
		return taskRepo.findOne(taskId);
	}
	
	public Task createTask(Task task){
		
		Story story = storyService.getStory(task.getStoryId());
		System.out.println(story);
		
		if(story != null)
		{
			
			task.setStoryId(story.getStoryId());
			task.setTaskActive(true);
			
			task = taskRepo.save(task);
			return task;
		}
		else
		{
			System.out.println("could not find story in DB");
			return null;
		}
	}
	
	//this function should be called after business logic from a previous function has determined that the update is valid
	public Task updateTask(Task task)
	{
		//check that a task with an ID that matches the parameter ID exists in the DB
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
	
//	public boolean deleteTask(Task task)
//	{
//		//check that a task with an ID that matches the parameter ID exists in the DB
//		boolean dbTaskExists = taskRepo.exists(task.getTaskId());
//		
//		if(dbTaskExists)
//		{
//			
//			taskRepo.delete(task);
//			//return taskRepo.exists(task.getTaskId());
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}

}
