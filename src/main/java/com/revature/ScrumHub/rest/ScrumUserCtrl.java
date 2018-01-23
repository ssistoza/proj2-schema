package com.revature.ScrumHub.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
@RequestMapping("/user")
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
		System.out.println("trying to get ID");
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
	
	@PostMapping("/login")
	public void loggingInUser(HttpServletRequest request, HttpServletResponse response, String username, String password) throws IOException, ServletException {
		Scrumhub_User loggedInUser = userService.validateUser(username, password);
		
		if(loggedInUser != null) {
			request.getSession().setAttribute("user", loggedInUser);
			request.getRequestDispatcher("index.html").forward(request, response);
		}else {
			System.err.println("invalid credentials -sending user back to login.html");
			response.sendRedirect("login.html");
		}
	}
}
