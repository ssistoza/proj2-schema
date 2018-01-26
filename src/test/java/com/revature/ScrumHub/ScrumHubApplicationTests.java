package com.revature.ScrumHub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.bean.SlStatus;
import com.revature.ScrumHub.bean.Swimlane;
import com.revature.ScrumHub.service.SlStatusService;
import com.revature.ScrumHub.service.SwimlaneService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScrumHubApplicationTests {

	@Autowired
	SwimlaneService SlService;
	
	@Autowired 
	SlStatusService slStatusService;
	
	@Test
	public void contextLoads() {}
	
	public SlStatus testSlStatus() {
		SlStatus ss = new SlStatus();
		ss.setSlStatusId(1);
		ss.setStatusType("To Do");
		return slStatusService.createSlStatus(ss);
	}
	
	public Swimlane testSwimlane() {
		
		SlStatus uu = new SlStatus();
		uu.setSlStatusId(1);
		uu.setStatusType("To Do");
		
		Board b = new Board();
		b.setbName("Personal Goals");
		b.setbId(1);		
		
		Swimlane s = new Swimlane();		
		s.setSlName("To Do");
		s.setSlOrder(1);
		s.setSlId(2);
		s.setSlStatus(uu); 
		s.setBoardKey(1);
		return SlService.createSwimlane(s);
	}
	
	@Test
	public void testAssignOwnerOfBoard() {
		Swimlane s = testSwimlane();
		SlStatus ss = testSlStatus();
		System.out.println(ss);
		System.out.println(s);		
	}

}
