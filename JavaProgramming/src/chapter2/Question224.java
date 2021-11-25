package chapter2;

import java.util.Scanner;

public class Question224 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
	
		String str = (String) "num";
		int sum =0;
		
	      for (int count=0; count < str.length(); count++) {
			sum += str.charAt(count)-'0';
		}
		System.out.println(sum);

	}
	

}
