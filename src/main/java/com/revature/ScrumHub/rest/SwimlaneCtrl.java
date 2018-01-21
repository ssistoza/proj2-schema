package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.service.SwimlaneService;

@RestController
public class SwimlaneCtrl {

	@Autowired
	SwimlaneService swimlaneService;

	@GetMapping("/swimlane/{id}")
	public Swimlane getSwimlane(@PathVariable int id) {
		System.out.println("SwimlaneCtrl -get");
		return swimlaneService.getSwimlane(id);
	}
		
		@PostMapping("/createSwimlane")
		public ResponseEntity<Swimlane> createSwimlane(@RequestBody Swimlane swimlane){
			System.out.println("SwimlaneCtrl -createSwimlane");
			swimlane = swimlaneService.createSwimlane(swimlane);
					return new ResponseEntity<Swimlane>(swimlane, HttpStatus.CREATED);		
		}
}
