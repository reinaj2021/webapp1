package com.mycompany.webapp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


@SuppressWarnings("unused")
public class Ch07Board {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	private Date date;
	public int getNo()	{
		return no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
	
	
	
	
	