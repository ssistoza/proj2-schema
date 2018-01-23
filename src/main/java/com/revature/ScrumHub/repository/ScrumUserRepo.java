package com.revature.ScrumHub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.ScrumUser;

@Repository
public interface ScrumUserRepo extends JpaRepository<ScrumUser, Integer> {

	
<<<<<<< HEAD
	List<Scrumhub_User> findAll(Iterable<Integer> userId);
	
	public boolean existsByUsernameIgnoreCase(String username);
	
	public Scrumhub_User findByUsernameAndPassword(String username, String password);
=======
	List<ScrumUser> findAll(Iterable<Integer> userId);
>>>>>>> e7c8e04188824d4770335994c3144aabbcaef192
}
