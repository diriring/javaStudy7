package com.java.s1.adressbook;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class PeopleData_1 {
	
	private Scanner sc;
	
	public PeopleData_1() {
		sc = new Scanner(System.in);
	}
	
	public int searchPeople(ArrayList<PeopleDTO> people) {
		
		System.out.println("검색할 사람의 이름을 입력하세요");
		String name = sc.next();
		
		int index = 0;
		
		for(int i=0;i<people.size();i++) {
			if(name.equals(people.get(i).getName())) {
				index = i;
				break;
			}
		}
		
		return index;
		
	}
	
	public void printPeople(PeopleDTO peopleDTO) {
		
		System.out.println("이름 : " + peopleDTO.getName());
		System.out.println("별명 : " + peopleDTO.getNickname());
		System.out.println("이메일 : " + peopleDTO.getEmail());
		System.out.println("전화번호 : " + peopleDTO.getPhonenum());
		System.out.println("생일 : " + peopleDTO.getBirth());
		
	}
	
	public void viewPeople(ArrayList<PeopleDTO> people) {
		
		System.out.println("정보를 출력합니다");
		
		for(int i=0;i<people.size();i++) {
			printPeople(people.get(i));
		}
		
	}
	
	public void addPeople(ArrayList<PeopleDTO> people) {
		
		people.add(enterPeople());
		
		System.out.println("추가되었습니다");
		
	}
	
	public ArrayList<PeopleDTO> makePeople() {
		
		
		ArrayList<PeopleDTO> people = new ArrayList<>();
		
		
		System.out.println("등록할 사람의 수를 입력하세요");
		int input = sc.nextInt();
		
		for(int i=0;i<input;i++) {
			
			people.add(enterPeople());
			
		}
		
		return people;
		
	}
	
	public PeopleDTO enterPeople() {
		
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
