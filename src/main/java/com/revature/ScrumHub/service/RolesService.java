package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.RolesRepo;

@Service
public interface RolesService {
	
	public Role getRole (int roleId);

}
