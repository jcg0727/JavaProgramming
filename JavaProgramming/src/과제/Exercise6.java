package 과제;

import java.util.Random;

public class Exercise6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[45];
		int[] lotto2 = new int [6];
		int temp = 0;
		int i = 0;
		
		
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;	
		}
		for (i= 1; i < lotto.length; i++) {
			int num = random.nextInt(45);		
			temp = lotto[1];
			lotto[1] = lotto[num];
			lotto[num] = temp;
		}
		lotto2[0] = lotto[0];
		lotto2[1] = lotto[1];
		lotto2[2] = lotto[2];
		lotto2[3] = lotto[3];
		lotto2[4] = lotto[4];
		lotto2[5] = lotto[5];
		
		System.out.print("로또번호 : ");
		for (int j = 0; j < lotto2.length; j++) {
			System.out.print(lotto2[j]+" ");
		}
	
	
	}

}
