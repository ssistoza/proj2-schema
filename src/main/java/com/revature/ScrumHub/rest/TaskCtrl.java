package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.Task;
import com.revature.ScrumHub.service.TaskService;


@RestController
@RequestMapping("/task/")
@CrossOrigin(origins="*")
public class TaskCtrl {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/{id}")
	public Task getTask(@PathVariable int id){
		return taskService.getTask(id);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Task> createTask(@RequestBody Task task){
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
	
	@PostMapping("/update")
	public ResponseEntity<Task> updateTask(@RequestBody Task task){
		task = taskService.updateTask(task);
		
		if(task != null)
		{
			return new ResponseEntity<Task>(task, HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<Task>(task, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Task> deleteTask(@RequestBody Task task){
		
		boolean isDeleted = taskService.deleteTask(task);
		
		if(isDeleted)
		{
			return new ResponseEntity<Task>(HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<Task>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
