package com.revature.ScrumHub.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingRest {
	
	
	@AfterReturning(pointcut=" execution(* com.revature.ScrumHub.rest.ScrumUserCtrl.loggingInUser(..))", returning= "returnVal")
	public void loginTracking(JoinPoint pjp, Object returnVal){
		Logger logger = LogManager.getLogger(LoggingRest.class);
		logger.info(pjp.getSignature());
		logger.info("This is the user logged in :");
		logger.info(returnVal);		
	}
	
}
