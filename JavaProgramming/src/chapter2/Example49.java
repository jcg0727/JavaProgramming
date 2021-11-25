package chapter2;

import java.util.Scanner;

public class Example49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			num += (str.charAt(i) - '0');
		}
		System.out.println(num);
	}

}

//    Scanner scanner = new Scanner(System.in);
//	int inputNum = scanner.nextInt();
//	int sum = 0;
//	while(true) {
//		sum += inputNum %10;
//		inputNum = inputNum/10;
//		if(inputNum==0) {
//			break;
//		}
//	}
//	
	
	
	
	
	
	
	
	