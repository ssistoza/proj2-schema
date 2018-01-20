package com.revature.ScrumHub;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrumHubApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ScrumHubApplication.class, args);		
	}
//	
//	public void storyDemo() {
//		Session session = sessionFactory.openSession();
//		System.out.println("Getting story");
//		
//	}
	
}
