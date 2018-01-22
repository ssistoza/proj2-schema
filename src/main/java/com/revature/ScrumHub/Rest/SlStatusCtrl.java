package com.revature.ScrumHub.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.service.SlStatusService;
import com.revature.ScrumHub.bean.SlStatus;

@RestController
public class SlStatusCtrl {

	@Autowired
	SlStatusService slStatusService;
	
	@GetMapping("/slStatus/{id}")
	public SlStatus getslStatus(@PathVariable int id) {
		System.out.println("SlStatusCtrl -get");
		return slStatusService.getSlStatus(id);
	}
		
		@PostMapping("/updateSlStatus")
		public ResponseEntity<SlStatus> createslStatus(@RequestBody SlStatus slStatus){
			System.out.println("SwimlaneCtrl -createSwimlane");
			slStatus = slStatusService.createSlStatus(slStatus);
					return new ResponseEntity<SlStatus>(slStatus, HttpStatus.CREATED);		
		}
	
}
