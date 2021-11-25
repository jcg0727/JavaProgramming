package 과제;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int total = a+b+c+d+e;
		double ave = total / 5.0;
		

		
		System.out.println("점수를 입력하세요.");
		System.out.println("프로그래밍 기초: " + a);
		System.out.println("데이터베이스: " + b);
		System.out.println("화면 구현: " + c);
		System.out.println("애플리케이션 구현: " + d);
		System.out.println("머신러닝: " + e);
		System.out.println("총점: " + total);
		System.out.println("평균: " + ave);
		if(ave>90) {
			System.out.println("학점: A");
		}else if(ave>=80) {
			System.out.println("학점: B");
		}else if(ave>=70) {
			System.out.println("학점: C");
		}else if(ave>=60) {
			System.out.println("학점: D");
		}else {
			System.out.println("학점: F");
		}
		
			
			
	
	
	
	
	}

}
