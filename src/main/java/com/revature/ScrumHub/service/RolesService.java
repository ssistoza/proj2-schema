package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.RolesRepo;

<<<<<<< HEAD:src/main/java/com/revature/ScrumHub/service/RolesService.java
@Service
public class RolesService {
	
	@Autowired
	RolesRepo rolesRepo;
=======

public interface RolesService {
>>>>>>> roles:src/main/java/com/revature/ScrumHub/Service/RolesService.java
	
	public Role getRole (int roleId);

}
