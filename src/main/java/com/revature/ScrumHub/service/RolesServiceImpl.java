package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.RolesRepo;


@Service
@Transactional
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesRepo rolesRepo;
	
	public Role getRole (int roleId) {
		System.out.println("Service -getRole");
		return rolesRepo.findOne(roleId);
	}	
}
