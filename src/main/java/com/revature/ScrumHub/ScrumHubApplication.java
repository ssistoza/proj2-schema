package com.revature.ScrumHub;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrumHubApplication {
	private static Logger logger = LogManager.getLogger(ScrumHubApplication.class);
	
	public static void main(String[] args) {
		logger.info("Log Started: Starting Spring Boot application..");
		SpringApplication.run(ScrumHubApplication.class, args);	
		
	}	
	

}