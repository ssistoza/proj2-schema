package com.revature.ScrumHub.service;

import com.revature.ScrumHub.bean.Task;

public interface TaskService {

	public Task getTask(int taskId);
	public Task createTask(Task task);
	public Task updateTask(Task task);
	public boolean deleteTask(Task task);
	
}
