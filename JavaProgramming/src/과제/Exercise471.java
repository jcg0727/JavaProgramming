package 과제;

import java.util.Scanner;

public class Exercise471 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("허용오차: ");			
		double tolerance = scanner.nextDouble();
		double pi = 3;
		double sign = 1;
		long i = 2;
		long count = 0;
		while(true) {
			pi += 4.0 / (i*(i+1)*(i+2)) * sign;
			sign *= -1;
			count++;
			i+=2;
			if(tolerance>Math.abs(Math.PI-pi)) {
				break;	
			}		
		}
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("계산된 파이값: " + pi);
		System.out.println("반복횟수: " + count);
	}

}
