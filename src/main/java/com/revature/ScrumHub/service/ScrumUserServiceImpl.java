package com.revature.ScrumHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.ScrumUser;
import com.revature.ScrumHub.repository.ScrumUserRepo;

@Service
@Transactional()
public class ScrumUserServiceImpl implements ScrumUserService{

	@Autowired
	ScrumUserRepo userRepo;
	
	@Override
<<<<<<< HEAD
	public Scrumhub_User validateUser(String username, String password) {
		Scrumhub_User tempUser = userRepo.findByUsernameAndPassword(username, password);
		if(tempUser != null) {
			return tempUser;
		}
		return null;
	}
	
	@Override
	public Scrumhub_User registration(Scrumhub_User user) {
		Boolean tempReg = userRepo.existsByUsernameIgnoreCase(user.getUsername());
		if(tempReg = true) {
			return new Scrumhub_User(user.getU_id(), user.getFirstname(), user.getLastname(), user.getUsername(), user.getEmail());
		}
		return null;
	}
	@Override
	public Scrumhub_User createNewScrumUser(Scrumhub_User user) {
=======
	public ScrumUser createNewScrumUser(ScrumUser user) {
>>>>>>> e7c8e04188824d4770335994c3144aabbcaef192
		if (user != null) {
		userRepo.save(user);
		}
		return null;
	}

	@Override
	public ScrumUser retrieveScrumUser(int id) {
		return userRepo.findOne(id);
	}

	@Override
	public ScrumUser updateScrumUser(ScrumUser user) {
		return userRepo.save(user);
	}

	@Override
	public List<ScrumUser> retrieveAllScrumUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public ScrumUser deleteScrumUser(ScrumUser user) {
		userRepo.delete(user.getU_id());
		return user;
	}

}
