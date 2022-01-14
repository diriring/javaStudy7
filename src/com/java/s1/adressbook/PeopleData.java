package com.java.s1.adressbook;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class PeopleData {
	
	private Scanner sc;
	
	public PeopleData() {
		sc = new Scanner(System.in);
	}
	
public String removePeople(ArrayList<PeopleDTO> people) {
		
		System.out.println("삭제할 사람의 이름을 입력하세요");
		String name = sc.next();
		
		boolean result = false;
		
		for(int i=0;i<people.size();i++) {
			if(name.equals(people.get(i).getName())) {
//				result = true;
//				people.remove(i);
				result = people.remove(people.get(i));
				break;
			}
		}
		
		if(result == true) {
			return "삭제 성공";
		}else {
			return "삭제 실패";
		}
		
	}
	
	public PeopleDTO searchPeople(ArrayList<PeopleDTO> people) {
		
		System.out.println("검색할 사람의 이름을 입력하세요");
		String name = sc.next();
		
		PeopleDTO peopleDTO = null;
		
		for(int i=0;i<people.size();i++) {
			if(name.equals(people.get(i).getName())) {
				peopleDTO = people.get(i);
				break;
			}
		}
		
		return peopleDTO;
		
	}
	
	public PeopleDTO addPeople() {
		
		PeopleDTO peopleDTO = new PeopleDTO();
		
		System.out.println("이름을 입력");
		peopleDTO.setName(sc.next());
		System.out.println("별명을 입력");
		peopleDTO.setNickname(sc.next());
		System.out.println("이메일을 입력");
		peopleDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력");
		peopleDTO.setPhonenum(sc.next());
		System.out.println("생일을 입력");
		peopleDTO.setBirth(sc.next());
		
		return peopleDTO;
		
	}
	

}
