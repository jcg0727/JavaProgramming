package chapter2;

public class Question26 {

	public static void main(String[] args) {
		int number = 30;
		char ch = 'C' ;
		int result = number++ + 3 + ++ch + ++number;
		
		System.out.println(number);
		System.out.println(ch);
		System.out.println(result);

	}

}
