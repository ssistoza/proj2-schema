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

import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.service.SwimlaneService;

@RestController
@RequestMapping("/swimlane/")
@CrossOrigin(origins = "*")
public class SwimlaneCtrl {

	@Autowired
	SwimlaneService swimlaneService;

	@GetMapping("/{id}")
	public Swimlane getSwimlane(@PathVariable int id) {
		return swimlaneService.getSwimlane(id);
	}

	@PostMapping("/create")
	public ResponseEntity<Swimlane> createSwimlane(@RequestBody Swimlane swimlane) {
		swimlane = swimlaneService.createSwimlane(swimlane);
		return new ResponseEntity<Swimlane>(swimlane, HttpStatus.CREATED);
	}

	@PostMapping("/update")
	public ResponseEntity<Swimlane> updateSwimlane(@RequestBody Swimlane swimlane) {
		swimlane = swimlaneService.updateSwimlane(swimlane);
		return new ResponseEntity<Swimlane>(swimlane, HttpStatus.CREATED);
	}

	@PostMapping("/reorder")
	public ResponseEntity<Swimlane> updateSwimlan(@RequestBody Swimlane swimlane) {
		swimlane = swimlaneService.reorderSwimlane(swimlane);
		return new ResponseEntity<Swimlane>(swimlane, HttpStatus.CREATED);
	}
}
