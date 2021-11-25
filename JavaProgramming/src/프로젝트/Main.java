package 프로젝트;

import java.util.Scanner;

public class Main {
	public void menu() {
		System.out.println("-------------커피--------------");
		System.out.println("1.Admin 로그인");
		System.out.println("2.직원 로그인");
		System.out.println("-------------------------------");
		System.out.println("선택해주세요 : " );
				
	}
	GoodsDAOA daoa = new GoodsDAOA();
	Scanner scanner = new Scanner(System.in);
	public void admin() throws Exception {
		System.out.print("아이디를 입력해 주세요 : ");
		String b = scanner.next();
		
		System.out.print("비밀번호를 입력해 주세요 : ");
		String c = scanner.next();
		while(true) {
			if(b.equals("admin") && c.equals("1234")) {
				System.out.println("-------------------------------");
				System.out.println("1.상품확인");
				System.out.println("2.매출확인");
				System.out.println("3.재고확인");
				System.out.println("4.직원확인");		
				break;
			}else {
				System.out.println("아이디 또는 비밀번호를 잘못 입력 하였습니다.");
				System.out.print("아이디를 입력해 주세요 : ");
				b = scanner.next();
				System.out.print("비밀번호를 입력해 주세요 : ");
				c = scanner.next();
			}
			
			
			
			
		}
	}


	public void emp() {
		System.out.println("-------------------------------");
		System.out.print("아이디를 입력해 주세요 : ");
		String d = scanner.next();
		System.out.print("비밀번호를 입력해 주세요 : ");
		String e = scanner.next();
		while(true) {
		if(d.equals("jcg") && e.equals("1234")) {
			System.out.println("-------------------------------");
			break;
		}else {
			System.out.println("아이디 또는 비밀번호를 잘못 입력 하였습니다.");
			System.out.print("아이디를 입력해 주세요 : ");
			d = scanner.next();
			System.out.print("비밀번호를 입력해 주세요 : ");
			e = scanner.next();
	}
		}
	
	
	
	}
	
	
	
}
