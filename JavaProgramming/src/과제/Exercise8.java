package 과제;

import java.util.Random;

public class Exercise8 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] num1 = new int[10000];
		for (int i = 0; i < num1.length; i++) {
			int num = random.nextInt(6)+1;
			num1[i] = num;
			System.out.print(num1[i]+"  ");
		} 
	}

}
