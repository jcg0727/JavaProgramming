package 과제;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int a = ((num1+num2)+Math.abs(num1-num2))/2;
		int b = ((num1+num2)-Math.abs(num1-num2))/2;
		
		System.out.println("첫 번째 숫자를 입력하세요: " + num1);
		System.out.println("두 번째 숫자를 입력하세요: " + num2);	
		System.out.println("큰 수를 작은 수로 나눈 몫은 " + a/b + "이고, " + "나머지는" + a%b + "이다." );
	}

}
