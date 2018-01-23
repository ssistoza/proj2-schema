package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.service.TaskService;

import com.revature.ScrumHub.bean.Task;


@RestController
public class TaskCtrl {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/task/{id}")
	public Task getTask(@PathVariable int id){
		return taskService.getTask(id);
	}
	
	@PostMapping("/createTask")
	public ResponseEntity<Task> createTask(@RequestBody Task task){
		System.out.println(task + " recieved from the user. Calling TaskService");
		
		task = taskService.createTask(task);
		
		if(task != null)
		{
			return new ResponseEntity<Task>(task, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<Task>(task, HttpStatus.BAD_REQUEST);
		}
		
	}
}