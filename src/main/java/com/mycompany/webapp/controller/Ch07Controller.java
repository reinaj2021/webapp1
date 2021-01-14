package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service.Mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Ch07Board;




@Controller
@RequestMapping("/ch07")
public class Ch07Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch07Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return"ch07/content";
	}
	@GetMapping("/method1")
	public String method1(Model model) {
		model.addAttribute("name","스프링");
		model.addAttribute("age","26");
		model.addAttribute("job","인공지능 개발자");
		return"ch07/el";
	}
		
		
		@GetMapping("/method2")
		public String method2(Model model) {
		Ch07Board board = new Ch07Board();
		board.setNo(1);
		board.setTitle("너무 추워요");
		board.setContent("덜추워요");
		board.setWriter("rj자바");
		board.setDate(new Date());
		model.addAttribute("board1",board);
		
		return"ch07/el";
		}

		@GetMapping("/method3")
		public String method3(Model model) {
			List<Ch07Board>	boardList = new ArrayList<>();
			for(int i=1; i<=10; i++) {
			
			
		Ch07Board board = new Ch07Board();
		board.setNo(i);
		board.setTitle("너무 추워요"+i);
		board.setContent("덜추워요"+i);
		board.setWriter("rj자바"+i);
		board.setDate(new Date());
		boardList.add(board);
			}
		model.addAttribute("boardList",boardList);
		
		return"ch07/el";
	}
	}

	
	

		
		
		