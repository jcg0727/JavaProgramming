package chapter2;

import java.util.Arrays;
import java.util.Random;

public class Exercise56 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		int temp = 0;
		
		for (int i = 0; i < ballArr.length; i++) {
			int num = random.nextInt(9);
			temp = ballArr[i];
			ballArr[i] = ballArr[num];
			ballArr[num] = temp;
			    
		}
		ball3[0]=ballArr[0];
		ball3[1]=ballArr[1];
		ball3[2]=ballArr[2];
		System.out.println(Arrays.toString(ballArr));
		
		System.out.println(Arrays.toString(ball3));
	
	}

}


