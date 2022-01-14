package com.java.s1.adressbook;

import java.util.Calendar;

public class PeopleDTO {
	
	private String name;
	private String nickname;
	private String email;
	private String phonenum;
	private Calendar birth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		int year = Integer.parseInt(birth.substring(0,4));
		int month = Integer.parseInt(birth.substring(4,6))-1;
		int day = Integer.parseInt(birth.substring(6));
		
		Calendar ca = Calendar.getInstance(); 
		ca.set(year, month, day);
		
		this.birth = ca;	
	}

}
