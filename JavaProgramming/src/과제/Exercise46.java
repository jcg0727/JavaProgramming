package 과제;

import java.util.Scanner;

public class Exercise46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 1;
		int b = 0;
		int c = 0;
		System.out.println("몇 번째 항까지 출력하시겠습니까?(3 이상 입력): ");		
		int num1 = scanner.nextInt();
		
		System.out.println(b);
		for(int i = 1; i < num1; i++) {			
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
         }
				
			if(num1>3) {				
				
			}else {
				System.out.println("3 이상의 수를 입력해 주세요.");
			}
	
		}
	}


