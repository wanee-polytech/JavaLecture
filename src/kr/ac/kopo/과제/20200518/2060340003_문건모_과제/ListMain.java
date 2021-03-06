package kopo.ac.kr.list01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member{
	
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void SetId(String id) {
		this.id = id;
	}
	
	public void SetPassword(String password) {
		this.password = password;
	}
}

public class ListMain {
	
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add(new Member("aaa","1111"));
		list.add(new Member("bbb","2222"));
		list.add(new Member("ccc","3333"));
		list.add(new Member("ddd","4444"));
		
		while(true) {
			int cnt = 0;
			System.out.println("패스워드 변경 서비스 입니다");
			System.out.println("변경할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			/*
				건모씨.. 만일 회원이 1000명이 워쩔꺼에요????
				case로 하나씩 다 비교할라구요???? ㅎㅎㅎㅎ
				다른 방법을 생각해봅시다
			*/

			switch(id){
			
			case "aaa" :
				cnt = 0;
				break;
			case "bbb" :
				cnt = 1;
				break;
			case "ccc" :
				cnt = 2;
				break;
			case "ddd" :
				cnt = 3;
				break;
			}
			
			if(!list.get(cnt).getId().equals(id)) {
				System.out.println("입력하신 아이디 : [" + id + "]는 존재하지 않습니다");
				System.out.println("서비스를 종료합니다");
				System.exit(0);
			}
			
			System.out.println("현재 패스워드를 입력하세요");
			String password = sc.nextLine();
			
			if(!list.get(cnt).getPassword().equals(password)) {
				System.out.println("패스워드가 틀렸습니다");
				System.out.println("서비스를 종료합니다");
				System.exit(0);
			}
			
			System.out.println("변경할 패스워드를 입력하세요 : ");
			String newPassword = sc.nextLine();
			list.get(cnt).SetPassword(newPassword);
			
			System.out.println("서비스를 종료합니다");
			System.out.println("수정된 결과");
			for(Member m  : list ) {
				System.out.println("ID : " + m.getId() + " ,Password :" + m.getPassword());
			}
			System.exit(0);
			
			
		}
		
		
	}
	
}

			
		
			
			
			
		
		
		

