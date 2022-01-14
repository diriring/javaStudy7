package com.java.s1.adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMenu {

	public void printMenu() {
	
		Scanner sc = new Scanner(System.in);
		PeopleData pd = new PeopleData();
		PeopleView pv = new PeopleView();
		ArrayList<PeopleDTO> people = new ArrayList<>();
		boolean check = true;
		while(check) {
			
			System.out.println("번호를 선택하세요");
			System.out.println("1. 전체 명단 출력");
			System.out.println("2. 명단 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 선택한 정보 제거");
			System.out.println("5. 프로그램 종료");
			
			int input = sc.nextInt();
			
			switch(input){
			case 1:
				pv.view(people);
			break;

			case 2:
				pv.view(pd.searchPeople(people));
			break;
			
			case 3:
				people.add(pd.addPeople());
			break;
				
			case 4:
				pv.message(pd.removePeople(people));
			break;
				
			case 5:
				System.out.println("프로그램을 종료합니다");
				check = false;
			break;

			default :
				System.out.println("올바른 번호를 입력하세요");
			break;
			
			}
			
		}
	}

}
