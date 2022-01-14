package com.java.s1.adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMenu_1 {
	
	PeopleData_1 pd = new PeopleData_1();
	
	public void printMenu() {
		
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<PeopleDTO> people = pd.makePeople();
		
		
		while(check) {
			
			System.out.println("번호를 선택하세요");
			System.out.println("1. 전체 명단 출력");
			System.out.println("2. 명단 검색 출력");
			System.out.println("3. 명단 추가");
			System.out.println("4. 선택한 정보 제거");
			System.out.println("5. 프로그램 종료");
			
			int input = sc.nextInt();
			
			switch(input){
			case 1:
				pd.viewPeople(people);
			break;

			case 2:
				System.out.println("정보를 확인할 사람의 이름을 검색합니다");
				int index = pd.searchPeople(people);
				pd.printPeople(people.get(index));
			break;
			
			case 3:
				System.out.println("추가할 사람의 정보를 입력합니다");
				pd.addPeople(people);
			break;
				
			case 4:
				System.out.println("삭제할 사람의 이름을 검색합니다");
				index = pd.searchPeople(people);
				people.remove(index);
				System.out.println("삭제했습니다");
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
