package com.revature.ScrumHub.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.ScrumUser;
import com.revature.ScrumHub.service.ScrumUserService;

@RestController
@RequestMapping("/user/")
@CrossOrigin(origins="*")
public class ScrumUserCtrl {

	@Autowired
	ScrumUserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<ScrumUser> createNewScrumUser(@RequestBody ScrumUser user){
		if (user == null ) return new ResponseEntity<ScrumUser>(user, HttpStatus.BAD_REQUEST);		
		user = userService.createNewScrumUser(user);
		if (user == null) {
			return new ResponseEntity<ScrumUser>(user, HttpStatus.CONFLICT);
		}else {
			return new ResponseEntity<ScrumUser>(user, HttpStatus.CREATED);
		}
	}
	
	@PostMapping("/checkExists")
	public ResponseEntity<Boolean> checkIfExistsUsername(@RequestBody ScrumUser user){
		boolean userBool = userService.checkIfScrumUserExists(user);
		return new ResponseEntity<Boolean>(userBool, HttpStatus.FOUND);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<ScrumUser> retrieveScrumUser(HttpServletRequest req, @PathVariable int id){
		ScrumUser retrieveOneUser = userService.retrieveScrumUser(id);
		return new ResponseEntity<ScrumUser>(retrieveOneUser, HttpStatus.ACCEPTED);
	}
	
	@RequestMapping("/all")
	public ResponseEntity<List<ScrumUser>> retrieveAllScrumUsers(){
		List<ScrumUser> retrieveAllUsers = userService.retrieveAllScrumUsers();
		return new ResponseEntity<List<ScrumUser>>(retrieveAllUsers, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<ScrumUser> updateScrumUser(@RequestBody ScrumUser user){
		ScrumUser updateUser = userService.updateScrumUser(user);
		return new ResponseEntity<ScrumUser>(updateUser, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<ScrumUser> deleteScrumUser(@RequestBody ScrumUser user){
		ScrumUser deletedUser = userService.deleteScrumUser(user);
		return new ResponseEntity<ScrumUser>(deletedUser, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ScrumUser> loggingInUser(@RequestBody ScrumUser user) throws IOException, ServletException {
		ScrumUser loggedInUser = userService.validateUser(user.getUsername(), user.getPassword());
		if(loggedInUser != null) {
			return new ResponseEntity<ScrumUser>(loggedInUser, HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<ScrumUser>(loggedInUser, HttpStatus.NOT_FOUND);
		}
	}
}
