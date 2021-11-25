package chapter2;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = 1;
		int num3 = (num1-num2 >=0) ? num2 : num1;
		int num4 = (num1-num2 < 0) ? num2 : num1;
				
		for(int i = num3; i<=num4; i++) {
			sum = sum * 1;
		}
		System.out.println(sum);
	}

}

//
//long num = 1L;
//
//for (int i =1; i <= end; i++) {			
//	num += start * end;			
//}
//System.out.println(num);