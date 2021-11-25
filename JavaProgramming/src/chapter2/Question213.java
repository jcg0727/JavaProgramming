package chapter2;

import java.util.Random;

public class Question213 {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(100);
		System.out.println(x);
		
		
		int x2 = random.nextInt(331) + 44 ; // (375-44)
		System.out.println(x2);
	}

}
