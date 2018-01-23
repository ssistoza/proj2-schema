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
	public ScrumUser validateUser(String username, String password) {
		ScrumUser tempUser = userRepo.findByUsernameAndPassword(username, password);
		if(tempUser != null) {
			return tempUser;
		}
		return null;
	}
		
	@Override
	public ScrumUser createNewScrumUser(ScrumUser user) {
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
		userRepo.delete(user.getuId());
		return user;
	}

}
