package chapter3;

import java.util.Scanner;


public class Question35 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		Scanner scanner = new Scanner(System.in);
    		
		int firstNum = scanner.nextInt(); 
		String buho = scanner.next(); 
		int secondNum = scanner.nextInt();
		
		
		if(buho.equals("+")){
			System.out.println(calc.add(firstNum, secondNum));
		}else if(buho.equals("-")){
			System.out.println(calc.substract(firstNum, secondNum));
		}else if(buho.equals("*")){
			System.out.println(calc.multiply(firstNum, secondNum));
		}else if(buho.equals("/")) {
			System.out.println(calc.divide(firstNum, secondNum));
		}else {
			System.out.println("연산종료");
		}
		
		
	}
}
