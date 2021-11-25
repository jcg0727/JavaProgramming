package 과제;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int capital = scanner.nextInt();
		int pop = scanner.nextInt();
		int income = scanner.nextInt();
		
		String str = (capital == 1 && pop >=100 || income >= 50) ? "이 도시는 메트로폴리스 입니다." : "이 도시는 메트로폴리스가 아닙니다.";
		
		System.out.println("수도입니까?(수도: 1, 수도아님: 0) " + capital);
		System.out.println("총 인구는?(단위: 만) " + pop);
		System.out.println("연소득이 1억 이상인 인구는?(단위: 만) " + income);
		System.out.println(str);
	}

}
