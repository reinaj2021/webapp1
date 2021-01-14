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
		if(userAgent.contains("Edg")) {
			logger.info("브라우저 종류 : 크롬");
		} else if(userAgent.contains("Edg")) {
			logger.info("브라우저 종류 : 엣지");
		} else if(userAgent.contains("Trident/7.0")) {
			logger.info("브라우저 종류: IE11");
		} else if(userAgent.contains("MSIE")) {
			logger.info("브라우저 종류: IE10이하");
		}
		return"ch05/content";
}
}