package com.revature.ScrumHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.bean.BoardMemberId;
import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.repository.BoardMemberRepo;

@Service
@Transactional
public class BoardMemberServiceImpl implements BoardMemberService {
	@Autowired
	BoardMemberRepo bmRepo;

	@Autowired
	BoardService bService;
	
	@Autowired 
	RolesService rService;
	
	@Override
	public BoardMember createNewBoard(BoardMember bm) {
		
		if ( bm != null ) {
			Board tBoard = bService.getBoard(bm.getSboard().getbId());
			Role tRole = rService.getRole(bm.getMemberRole().getRoleId());
			bm.setSboard(tBoard);
			bm.setMemberRole(tRole);
			bmRepo.save(bm);
		}
			
			
		return bm;
	}

	@Override
	public BoardMember getBoardMember(int bId, int uId) {
		BoardMember bm = new BoardMember();
		if ( bId > 0 | uId > 0 ) {
			BoardMemberId bmId = new BoardMemberId();
			bmId.setSboard(bId);
			bmId.setBoardMemberId(uId);
			bm = bmRepo.findOne(bmId);
		}
		return bm;
	}

	@Override
	public BoardMember updateBoardMember(BoardMember bm) {
		BoardMember temp = getBoardMember(bm.getSboard().getbId(), bm.getBoardMemberId());
		if ( temp == null ) { return temp; }
		bm = bmRepo.save(bm);
		return bm;
	}

	@Override
	public boolean deleteBoardMember(BoardMember bm) {
		if ( bm != null ) {
			bmRepo.delete(bm);
			return true;
		}
		return false;
	}
	
	
}
