package chapter2;

import java.util.Scanner;

public class Example212 {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		
		switch(mon) {
			case 3: case 4: case 5:
			System.out.println("봄 입니다.");
			break;
			
			case 6: case 7: case 8:
			System.out.println("여름 입니다.");
			break;
			
			case 9: case 10: case11:
			System.out.println("가을 입니다.");
			break;
			
			case 12: case 1: case 2:
			System.out.println("겨울 입니다.");
			break;
			
			default:
			System.out.println("잘못된 월을 입력하셨습니다.");
		}

	}

}
