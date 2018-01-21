package com.revature.ScrumHub.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Task;
import com.revature.ScrumHub.repository.TaskRepo;

@Service
public class TaskService {
	
	@Autowired
	TaskRepo taskRepo;
	
	public Task getTask(int taskId){
		System.out.println("service -getTask");
		return taskRepo.findOne(taskId);
	}
	
	public Task createTask(Task task){
		System.out.println("attempting to insert " + task);
		task.setTaskTimestamp(new Timestamp(new Date().getTime()));
		
		taskRepo.save(task);
		return task;
	}

}
