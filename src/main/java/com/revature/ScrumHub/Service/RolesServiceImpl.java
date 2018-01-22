package com.revature.ScrumHub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.Repository.RolesRepository;
import com.revature.ScrumHub.bean.Role;

@Transactional
@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesRepository rolesRepo;
	
	public Role getRole (int roleId) {
		System.out.println("Service -getRole");
		return rolesRepo.findOne(roleId);
	}	
}
