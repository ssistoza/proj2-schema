package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.service.RolesService;

@RestController
@RequestMapping("/roles/")
@CrossOrigin(origins="*")
public class RolesCtrl {

	@Autowired
	RolesService roleService;
	
	@GetMapping("/{id}")
	public Role getRole(@PathVariable int id) {
		System.out.println("RoleCtrl -get");
		return roleService.getRole(id);
		
	}
	
}
