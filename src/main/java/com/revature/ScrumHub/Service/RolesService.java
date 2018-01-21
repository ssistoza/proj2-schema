package com.revature.ScrumHub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.Repository.RolesRepository;
import com.revature.ScrumHub.bean.Role;


public interface RolesService {
	
	public Role getRole (int roleId);

}
