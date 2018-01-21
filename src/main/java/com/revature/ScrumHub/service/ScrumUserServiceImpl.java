package com.revature.ScrumHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Scrumhub_User;
import com.revature.ScrumHub.repository.ScrumUserRepo;

@Service
@Transactional()
public class ScrumUserServiceImpl implements ScrumUserService{

	@Autowired
	ScrumUserRepo userRepo;
	
	@Override
	public Scrumhub_User createNewScrumUser(Scrumhub_User user) {
		if (user != null) {
		userRepo.save(user);
		}
		return null;
		
	}

	@Override
	public Scrumhub_User retrieveScrumUser(int id) {
		return userRepo.findOne(id);
	}

	@Override
	public Scrumhub_User updateScrumUser(Scrumhub_User user) {
		return userRepo.save(user);
	}

	@Override
	public List<Scrumhub_User> retrieveAllScrumUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public Scrumhub_User deleteScrumUser(Scrumhub_User user) {
		userRepo.delete(user.getU_id());
		return user;
	}

}
