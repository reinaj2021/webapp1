package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03") //컨트롤러의 경로는 반드시 requestMapping 사용해야 함. 요청 시 ch03이 있을 때 실행하겠다.
public class Ch03Controller3 {
	private static final Logger logger = LoggerFactory.getLogger(Ch03Controller3.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch03/content";
	}
	
	
	
}


