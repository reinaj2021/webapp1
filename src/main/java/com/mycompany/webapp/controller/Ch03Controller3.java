package com.mycompany.webapp.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.webapp.dto.Ch03Dto;

@Controller
@RequestMapping("/ch03") //컨트롤러의 경로는 반드시 requestMapping 사용해야 함. 요청 시 ch03이 있을 때 실행하겠다.
public class Ch03Controller3 {
	private static final Logger logger = LoggerFactory.getLogger(Ch03Controller3.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch03/content";
	}
	
	@RequestMapping("/method1")
	public String method1(
			String param1, String param2,String param3,
			String param4, @DateTimeFormat(pattern="yyyy-MM-dd") Date param5) {
		logger.info ("param1:"+ param1);
		logger.info ("param2:"+ param2);
	    logger.info ("param3:"+ param3);
		logger.info ("param4:"+ param4);
		logger.info ("param5:"+ param5);
		return"ch03/content";
	}

@RequestMapping("/method2")
public String method2(
		@RequestParam("param1")
		String param1, String param2,String param3,
		String param4, @DateTimeFormat(pattern="yyyy-MM-dd") Date param5) {
	logger.info ("param1:"+ param1);
	logger.info ("param2:"+ param2);
    logger.info ("param3:"+ param3);
	logger.info ("param4:"+ param4);
	logger.info ("param5:"+ param5);
	return"ch03/content";
}

@RequestMapping("/method3")
public String method3(
		String param1,
		@RequestParam(defaultValue="0") int param2,
		@RequestParam(defaultValue="0") double param3,
		@RequestParam(defaultValue="0") boolean param4,
		
		String param11, int param12,double param13,
		boolean param14, @DateTimeFormat(pattern="yyyy-MM-dd") Date param15) {
	logger.info ("param1:"+ param11);
	logger.info ("param2:"+ param12);
    logger.info ("param3:"+ param13);
	logger.info ("param4:"+ param14);
	logger.info ("param5:"+ param15);
	return"ch03/content";
}
@RequestMapping("/method4")
public String method4(Ch03Dto dto) {
		
	logger.info ("param1:"+ dto.getParam1());
	logger.info ("param2:"+ dto.getParam2());
    logger.info ("param3:"+ dto.getParam3());
	logger.info ("param4:"+ dto.getParam4());
	logger.info ("param5:"+ dto.getParam5());
	return"ch03/content";
}
}

