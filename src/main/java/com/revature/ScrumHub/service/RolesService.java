package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.RolesRepo;

@Service
public class RolesService {
	
	@Autowired
	RolesRepo rolesRepo;
	
	public Role getRole (int roleId) {
		System.out.println("Service -getRole");
		return rolesRepo.findOne(roleId);
	}	
	
	public Role createRole (Role r) {
		System.out.println("Service -setRole");
		rolesRepo.save(r);
		return r;
	}
}
