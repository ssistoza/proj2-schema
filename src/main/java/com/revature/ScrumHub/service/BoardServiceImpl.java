package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.repository.BoardRepo;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepo sbRepo;

	@Override
	public Board createNewBoard(Board sb) {
		if ( sb.getbName().length() <= 0) { return null; }
		sbRepo.save(sb);
		return sb;
	}

	@Override
	public Board getBoard(int bId) {
		Board temp = new Board();
		if ( bId > 0  ) temp = sbRepo.findOne(bId);
		return temp;
	}

	@Override
	public Board updateName(int bId, String newName) {
		Board sb = getBoard(bId);
		if ( sb == null ) { return new Board(); }
		sb.setbName(newName);
		sbRepo.save(sb);
		return sb;
	}
	
	@Override
	public int deleteBoard(int id) {
		Board temp = getBoard(id);
		if ( temp != null ) {
			sbRepo.delete(temp);
			return 1;
		}
		return 0;
	}

	
}
