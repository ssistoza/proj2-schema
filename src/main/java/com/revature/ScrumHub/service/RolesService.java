package com.revature.ScrumHub.service;

import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Role;

@Service
public interface RolesService {
	
	public Role getRole (int roleId);

}
