package com.mycompany.webapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/ch06")
public class ch06controller {
	private static final Logger logger = LoggerFactory.getLogger(ch06controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return"ch06/content";
	}
	@GetMapping("/forward")
	public String forward() {
		logger.info("실행");
		return"ch06/forward";
	}
	@GetMapping("/redirect")
	public String redirect() {
		logger.info("실행");
		return"redirect:/ch06/content";
	}
	@GetMapping("/login")
	public String login() {
		logger.info("실행");
		return"redirect:/ch06/content";
}
}
	
		