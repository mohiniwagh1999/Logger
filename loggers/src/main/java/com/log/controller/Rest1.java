package com.log.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {
	
	private Logger logger = LoggerFactory.getLogger(Rest1.class);
	
	@GetMapping("/test")
	public String getmessage()
	{
		logger.info("******execution started*************");
		String msg= "hi mohini";
		logger.info("******execution ended*************");
		return msg;
		
		
	}

}
