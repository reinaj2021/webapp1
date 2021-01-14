package com.mycompany.webapp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class Ch03Dto<Private> {
	
	private String param1;
	public String getString() {
		return param1;
	}
	public void setString(Private string) {
		string = string;
	}
	public int getParam2() {
		return param2;
	}
	public void setParam2(int param2) {
		this.param2 = param2;
	}
	public double getParam3() {
		return param3;
	}
	public void setParam3(double param3) {
		this.param3 = param3;
	}
	public boolean isParam4() {
		return param4;
	}
	public void setParam4(boolean param4) {
		this.param4 = param4;
	}
	public Private getDate() {
		Private Date = null;
		return Date;
	}
	public void setDate(Private date) {
		Private Date = date;
	}
	int param2;
	private double param3;
	private boolean param4;
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date param5;
	public String getParam1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getParam4() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getParam5() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

}
