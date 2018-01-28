package com.revature.ScrumHub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.ScrumUser;

@Repository
public interface ScrumUserRepo extends JpaRepository<ScrumUser, Integer> {

	List<ScrumUser> findAll(Iterable<Integer> userId);
	
	public boolean existsByUsernameIgnoreCase(String username);
	
	public ScrumUser findByUsernameAndPassword(String username, String password);
	
	public ScrumUser findByUsername(String username);
	
	public ScrumUser findByUsernameIgnoreCase(String username);

}
