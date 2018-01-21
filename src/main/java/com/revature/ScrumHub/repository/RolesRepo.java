package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ScrumHub.bean.Role;

public interface RolesRepo extends JpaRepository<Role, Integer>{

}
