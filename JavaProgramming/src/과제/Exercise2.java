package 과제;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		
		if(num>=20 && num<=29){
			System.out.println("20대입니다.");
		}else {
			System.out.println("20대가 아닙니다.");
		}
	}

}
