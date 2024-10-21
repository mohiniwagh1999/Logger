package com.log.controller;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

	//.application.property configuration
	//spring.application.name=loggers
	//logging.file.name=mohini.log
	//acces logging factory
	Logger logger=LoggerFactory.getLogger(UserRest.class);
	//bydefault log appender is console appender
	//i write logging.file.name=mohini.log in .property file
	@GetMapping("/greet")
	public String greet()
	{
	
		logger.trace("every line of execution");
		logger.debug("store  execution flow at low level");
		//Info loffing by default level  ...debug and trace not executed
		logger.info("store  execution flow at high level");
		String msg="welcomes you";
		logger.error("store exception of our app");
		logger.warn("store warning message out app");
		
		
		return msg;
	}
	
	//log monitoring using putty software with linux
	//window with ELK gui based splunk
	
	
}
