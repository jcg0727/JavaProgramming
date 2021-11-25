package 과제;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base  = scanner.nextDouble();
		double height= scanner.nextDouble();
		double num1 = base * base * Math.PI;
		double num2 = base * base * Math.PI * height;
		System.out.println("원기둥 밑면의 반지름을 입력하시오.(단위:cm): " + base);
		System.out.println("원기둥의 높이를 입력하시오.(단위:cm): " + height);
		System.out.println("원기둥의 밑면의 넓이는 " +num1+"㎠이고, 원기둥의 부피는 " + num2 +"㎠이다.");
	}

}
	