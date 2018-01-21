package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.Story;
import com.revature.ScrumHub.service.StoryService;

@RestController
public class StoryCtrl {

	@Autowired
	StoryService storyService;
	
	@GetMapping("/story/{id}")
	public Story getStory(@PathVariable int id) {
		System.out.println("StoryCtrl -get");
		return storyService.getStory(id);
	}
	
	@PostMapping("/createStory")
	public ResponseEntity<Story> createStory(@RequestBody Story story) {
		System.out.println("StoryCtrl -createStory");
		story = storyService.createStory(story);		
		return new ResponseEntity<Story>(story, HttpStatus.CREATED);
	}
}
