package 과제;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float  num = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		
		System.out.println("가로의 길이는?(단위:m): " + num);
		System.out.println("세로의 길이는?(단위:m): " + num2);
		System.out.println("직사각형의 넓이: " + num*num2);
		System.out.println("직사각형의 둘레: " + (2*num + 2*num2));
		
		
	}

}
