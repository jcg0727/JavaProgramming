package chapter2;

import java.util.Random;

public class Question218 {

	public static void main(String[] args) {
		Random random = new Random();
		int score = random.nextInt(101);
		System.out.println(score);
		
		switch(score/10) {
			case 10:
		    case 9:
			System.out.println("A");
			break;
			
			case 8:
			System.out.println("B");
			break;
			
			case 7:
			System.out.println("C");
			break;
			
			case 6:
			System.out.println("D");
			break;
					
			default:
			System.out.println("F");
		}
		
		
	}

}
