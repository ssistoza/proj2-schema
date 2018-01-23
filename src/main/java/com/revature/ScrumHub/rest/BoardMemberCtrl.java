package com.revature.ScrumHub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.service.BoardMemberService;

@RestController
@RequestMapping("/boardmember/")
public class BoardMemberCtrl {
	
	@Autowired
	BoardMemberService bmService;
	
	@PostMapping("/create")
	public ResponseEntity<BoardMember> createNewBoardMember(@RequestBody BoardMember bm){
		
		if (bm != null ) {
			bm = bmService.createNewBoard(bm);
			return new ResponseEntity<BoardMember>(bm, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<BoardMember>(bm, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/update")
	public ResponseEntity<BoardMember> updateBoardMember(@RequestBody BoardMember bm){
		
		if ( bm != null ) {
			bm = bmService.updateBoardMember(bm);
			return new ResponseEntity<BoardMember>(bm, HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<BoardMember>(bm, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Boolean> deleteBoardMember(@RequestBody BoardMember bm){
		Boolean deleted = false;
		if ( bm != null ) {
			deleted = bmService.deleteBoardMember(bm);
			return new ResponseEntity<Boolean>(deleted, HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<Boolean>(deleted, HttpStatus.BAD_REQUEST);
	}
}
