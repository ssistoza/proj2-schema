package com.revature.ScrumHub.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ScrumHub.bean.Burndown;
import com.revature.ScrumHub.service.BurndownService;

@RestController
@RequestMapping("/burndown/")
@CrossOrigin(origins="*")
public class BurndownCtrl {
	
	@Autowired
	BurndownService bService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Burndown> getBurndown(@PathVariable int burnId){
		Burndown bd = new Burndown();
		bd.setBoardId(burnId);
		bd = bService.getBurndown(bd);
		if ( bd != null ) return new ResponseEntity<Burndown>(bd, HttpStatus.ACCEPTED);
		return new ResponseEntity<Burndown>(bd, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/byboard/{id}")
	public ResponseEntity<Set<Burndown>> getBurndowns(@PathVariable int boardId){
		Set<Burndown> bds = new HashSet<>();
		bds = bService.getBurndowns(boardId);
		if (bds != null ) return new ResponseEntity<Set<Burndown>>(bds, HttpStatus.ACCEPTED);
		return new ResponseEntity<Set<Burndown>>(bds, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Burndown> createBurndown(@RequestBody Burndown bd){
		if (bd == null) return new ResponseEntity<Burndown>(bd, HttpStatus.BAD_REQUEST); 
		bd = bService.createBurndown(bd);
		return new ResponseEntity<Burndown>(bd, HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Burndown> updateBurndown(@RequestBody Burndown bd){
		if (bd == null) return new ResponseEntity<Burndown>(bd, HttpStatus.BAD_REQUEST);
		bd = bService.getBurndownByDateAndBoard(bd.getBoardId(), bd.getBurnDate());
		if ( bd != null ) return new ResponseEntity<Burndown>(bd, HttpStatus.ACCEPTED);
		return createBurndown(bd);
	}
}
