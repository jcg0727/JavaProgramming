package 과제;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		boolean boo = num1>num2;
		
        System.out.println("첫번째 수를 입력하세요: " + num1);
		System.out.println("두번째 수를 입력하세요: " + num2);
		System.out.println("첫번째 수가 두번째 수보다 큰가? "+ boo);
	}

}
