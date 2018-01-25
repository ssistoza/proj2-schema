package com.revature.ScrumHub.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		return new ResponseEntity<ScrumUser>(user, HttpStatus.ACCEPTED);
	}
	
	@RequestMapping("/{id}")
	public ScrumUser retrieveScrumUser(HttpServletRequest req, @PathVariable int id){
		return userService.retrieveScrumUser(id);
	}
	
	@RequestMapping("/all")
	public List<ScrumUser> retrieveAllScrumUsers(){
		
		return userService.retrieveAllScrumUsers();
	}
	
	@PostMapping("/update")
	public ScrumUser updateScrumUser(@RequestBody ScrumUser user){
		
		return userService.updateScrumUser(user);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<ScrumUser> deleteScrumUser(@RequestBody ScrumUser user){
		ScrumUser deletedUser = userService.deleteScrumUser(user);
		return new ResponseEntity<ScrumUser>(deletedUser, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/login")
	public void loggingInUser(HttpServletRequest request, HttpServletResponse response, String username, String password) throws IOException, ServletException {
		ScrumUser loggedInUser = userService.validateUser(username, password);
		
		if(loggedInUser != null) {
			request.getSession().setAttribute("user", loggedInUser);
			request.getRequestDispatcher("index.html").forward(request, response);
		}else {
			System.err.println("invalid credentials -sending user back to login.html");
			response.sendRedirect("login.html");
		}
	}
}
