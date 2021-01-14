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

@GetMapping("/method2")
public String method2(HttpServletRequest request){
	logger.info("실행");
	
	String userAgent = request.getHeader("user-Agent");
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

@GetMapping("/method3")
public String method3(HttpServletRequest request, HttpServletResponse response){
	//쿠키생성
	Cookie cookie1 = new Cookie("memberId", "white");
	Cookie cookie2 = new Cookie("loginStatus", "ok");
	//쿠키를 응답에 추가해서 클라이언트로 보내기
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	//응답 본문을 생성하는 뷰 리턴
	return"ch05/content";
}

@GetMapping("/method4")
public String method4(HttpServletRequest request, 
		HttpServletResponse response){
	//브라우저가 요청헤더에 보낸 쿠키값 읽기
	Cookie[] cookieArr = request.getCookies();
	for(Cookie cookie : cookieArr) {
		String name = cookie.getName();
		String value= cookie.getValue();
		logger.info(name +";" + value);
		//응답 본문을 생성하는 뷰 리턴
		return"ch05/content";}
	return null;
	}

	@GetMapping("/method5")
	public String method5(
			@CookieValue String memberId,
			@CookieValue ("loginStatus") String status){
		logger.info("memberId:" + memberId);
		logger.info("loginStatus:" +  status);
		return "ch05/content";
	}
}
		
	

		//브라우저가 요청헤더에 보낸 쿠키값 읽기
		
	
	
	