package 과제;

import java.util.Scanner;

public class Exercise47 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		double match = Math.PI;
		double result = 3;
		int cnt = 1;
		double sum = 0;
		
		while(true) {
			if(cnt%2 ==0 ) {
				result -= (4/((2+sum) * (3+sum) * (4+sum)));
			}else {
				result += (4/((2+sum) * (3+sum) * (4+sum)));
 			}
			if(Math.abs(match-result)<input) {
				break;
			}
			sum += 2;
			cnt++;
		}
		System.out.println("허용오차 = " + input);
		System.out.println("Math.PI = " + match);
		System.out.println("계산된 파이값 = " + result);
		System.out.println("반복횟수 = " + cnt);
	}

}
