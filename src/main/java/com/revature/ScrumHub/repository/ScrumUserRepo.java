package com.revature.ScrumHub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.Scrumhub_User;

@Repository
public interface ScrumUserRepo extends JpaRepository<Scrumhub_User, Integer> {

	
	List<Scrumhub_User> findAll(Iterable<Integer> userId);
}
