package chapter2;

import java.util.Random;

public class Question216 {

	public static void main(String[] args) {
		Random random = new Random();
		int score = random.nextInt(101);	
		System.out.println(score);

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
