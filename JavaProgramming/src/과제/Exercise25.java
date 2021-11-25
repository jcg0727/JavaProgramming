package 과제;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a500 = scanner.nextInt();
		int a100 = scanner.nextInt();
		int a50 = scanner.nextInt();
		int a10 = scanner.nextInt();
		
		
		System.out.println("500원짜리 동전의 갯수: " + a500);
		System.out.println("100원짜리 동전의 갯수: " + a100);
		System.out.println("50원짜리 동전의 갯수: " + a50);
		System.out.println("10원짜리 동전의 갯수: " + a10);
		System.out.println("저금통 안의 동전의 액수: " + (a500*500 + a100*100 + a50*50 + a10*10));
	}

}
