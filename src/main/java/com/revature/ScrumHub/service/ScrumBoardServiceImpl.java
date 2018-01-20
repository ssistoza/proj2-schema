package com.revature.ScrumHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.ScrumBoard;
import com.revature.ScrumHub.repository.ScrumBoardRepo;

@Service
public class ScrumBoardServiceImpl implements ScrumBoardService {

	@Autowired
	ScrumBoardRepo sbRepo;

	@Transactional
	@Override
	public ScrumBoard createNewBoard(ScrumBoard sb) {
		if ( sb.getbName().length() <= 0) { return null; }
		sbRepo.save(sb);
		return sb;
	}

	@Override
	public ScrumBoard getBoard(int bId) {
		ScrumBoard temp = new ScrumBoard();
		if ( bId > 0  ) temp = sbRepo.findOne(bId);
		return temp;
	}

	@Override 
	public List<ScrumBoard> getAllUserBoards(int scrumUserId) {
		List<ScrumBoard> listTemp = new ArrayList<>();
		// if ( scrumUserId > 0 ) listTemp = sbRepo.getAllBoardsBybOwner(); 
		return listTemp;
	}

	@Transactional
	@Override
	public ScrumBoard updateName(int bId, String newName) {
		ScrumBoard sb = getBoard(bId);
		if ( sb == null ) { return new ScrumBoard(); }
		sb.setbName(newName);
		sbRepo.save(sb);
		return sb;
	}
	
	@Override
	public int deleteBoard(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
