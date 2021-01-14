package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;




@Controller
public class ch05controller5 {
	private static final Logger logger = LoggerFactory.getLogger(ch05controller5.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return"ch05/content";
	}
	@GetMapping("/method1")
	public String method1(@RequestHeader("User-Agent") String userAgent){
		logger.info("실행");
		logger.info("userAgent");
		return"ch05/content";
}
}