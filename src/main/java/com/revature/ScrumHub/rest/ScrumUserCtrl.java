package com.revature.ScrumHub.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.ScrumUser;
import com.revature.ScrumHub.service.ScrumUserServiceImpl;

@RestController
@RequestMapping("/user/")
public class ScrumUserCtrl {

	@Autowired
	ScrumUserServiceImpl userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<ScrumUser> createNewScrumUser(@RequestBody ScrumUser user){
		if (user == null ) return new ResponseEntity<ScrumUser>(user, HttpStatus.BAD_REQUEST);
		user = userService.createNewScrumUser(user);
		return new ResponseEntity<ScrumUser>(user, HttpStatus.ACCEPTED);
	}
	@RequestMapping("/retrieveUser/{id}")
	public ScrumUser retrieveScrumUser(HttpServletRequest req, @PathVariable int id){
		
		return userService.retrieveScrumUser(id);
	}
	@RequestMapping("/retrieveAllUsers")
	public List<ScrumUser> retrieveAllScrumUsers(){
		
		return userService.retrieveAllScrumUsers();
	}
	@PostMapping("/updateUser")
	public ScrumUser updateScrumUser(@RequestBody ScrumUser user){
		
		return userService.updateScrumUser(user);
	}
	@PostMapping("/deleteUser")
	public ResponseEntity<ScrumUser> deleteScrumUser(@RequestBody ScrumUser user){
		ScrumUser deletedUser = userService.deleteScrumUser(user);
		return new ResponseEntity<ScrumUser>(deletedUser, HttpStatus.ACCEPTED);
	}
}
