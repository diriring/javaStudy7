package com.java.s1.adressbook;

import java.util.ArrayList;

public class PeopleView {
	
	public void message(String str) {
		System.out.println(str);
	}
	
	public void view(PeopleDTO peopleDTO) {
		
		if(peopleDTO != null) {
			System.out.println("이름 : " + peopleDTO.getName());
			System.out.println("별명 : " + peopleDTO.getNickname());
			System.out.println("이메일 : " + peopleDTO.getEmail());
			System.out.println("전화번호 : " + peopleDTO.getPhonenum());
			System.out.println("생일 : " + peopleDTO.getBirth());
		}else {
			System.out.println("정보 없음");
		}
	}
	
	public void view(ArrayList<PeopleDTO> people) {
		
		System.out.println("정보를 출력합니다");
		
		for(int i=0;i<people.size();i++) {
			
			PeopleDTO peopleDTO = people.get(i);
			
			System.out.println("이름 : " + peopleDTO.getName());
			System.out.println("별명 : " + peopleDTO.getNickname());
			System.out.println("이메일 : " + peopleDTO.getEmail());
			System.out.println("전화번호 : " + peopleDTO.getPhonenum());
			System.out.println("생일 : " + peopleDTO.getBirth());
			
		}
		
	}

}
