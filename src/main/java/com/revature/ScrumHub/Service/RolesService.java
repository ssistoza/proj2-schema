package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.RolesRepository;

@Service
public class RolesService {
	
	@Autowired
	RolesRepository rolesRepo;
	
	public Role getRole (int roleId) {
		System.out.println("Service -getRole");
		return rolesRepo.findOne(roleId);
	}	

}
