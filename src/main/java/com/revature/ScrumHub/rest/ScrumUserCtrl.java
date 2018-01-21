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

import com.revature.ScrumHub.bean.Scrumhub_User;
import com.revature.ScrumHub.service.ScrumUserServiceImpl;

@RestController
@RequestMapping("/user/")
public class ScrumUserCtrl {

	@Autowired
	ScrumUserServiceImpl userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<Scrumhub_User> createNewScrumUser(@RequestBody Scrumhub_User user){
		if (user == null ) return new ResponseEntity<Scrumhub_User>(user, HttpStatus.BAD_REQUEST);
		user = userService.createNewScrumUser(user);
		return new ResponseEntity<Scrumhub_User>(user, HttpStatus.ACCEPTED);
	}
	@RequestMapping("/retrieveUser/{id}")
	public Scrumhub_User retrieveScrumUser(HttpServletRequest req, @PathVariable int id){
		
		return userService.retrieveScrumUser(id);
	}
	@RequestMapping("/retrieveAllUsers")
	public List<Scrumhub_User> retrieveAllScrumUsers(){
		
		return userService.retrieveAllScrumUsers();
	}
	@PostMapping("/updateUser")
	public Scrumhub_User updateScrumUser(@RequestBody Scrumhub_User user){
		
		return userService.updateScrumUser(user);
	}
	@PostMapping("/deleteUser")
	public ResponseEntity<Scrumhub_User> deleteScrumUser(@RequestBody Scrumhub_User user){
		Scrumhub_User deletedUser = userService.deleteScrumUser(user);
		return new ResponseEntity<Scrumhub_User>(deletedUser, HttpStatus.ACCEPTED);
	}
}
