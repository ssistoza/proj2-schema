package com.revature.ScrumHub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.bean.Role;
import com.revature.ScrumHub.bean.Scrumhub_User;
import com.revature.ScrumHub.service.BoardService;
import com.revature.ScrumHub.service.RolesService;
import com.revature.ScrumHub.service.ScrumUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScrumHubApplicationTests {

	@Autowired
	BoardService bService;
	
	@Autowired
	ScrumUserService suService;
	
	@Autowired 
	RolesService rService;
	
	@Test
	public void contextLoads() {	
		
	}
	
	public Scrumhub_User testCreateNewScrumUser() {
		Scrumhub_User su = new Scrumhub_User();
		su.setUsername("myUser");
		su.setPassword("myPassword");
		su.setFirstname("myFirstName");
		su.setLastname("myLastName");
		su.setEmail("myemail@email.com");
		return suService.createNewScrumUser(su);
	}
	 
	public Board testCreateNewBoard() {
		Board b = new Board();
		b.setbName("Personal Goals");
		return bService.createNewBoard(b);
	}
	
	public Role testCreateNewRole() {
		Role r = new Role();
		r.setRoleId(1);
		r.setRoleType("Owner");
		return rService.createRole(r);
	}
	
	@Test
	public void testAssignOwnerOfBoard() {
		Scrumhub_User su = testCreateNewScrumUser();
		Board b = testCreateNewBoard();
		Role r = testCreateNewRole();
		
		BoardMember bm = new BoardMember();
		bm.setBoardMember(su.getU_id());
		bm.setSboard(b);
		bm.setMemberRole(r);
		
		su.addAssociatedBoards(bm);
		su = suService.updateScrumUser(su);
		System.out.println(su);
		
	}
}
