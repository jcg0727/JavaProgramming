package 연습;

import java.util.Scanner;
import java.util.Random;

public class 연습 {

	public static void main(String[] args) {
		int[] score = new int[7];	
		 Random random = new Random();
		int sum = 0;
		int i=0;
		int max = score[0];
		int min = score[0];
		System.out.print("score값 : {");
		for(i = 0; i < score.length; i++) {
			score[i] = random.nextInt(101);
			sum = sum + score[i];
			if(i<score.length-1) {
				System.out.print(score[i] + ", ");
			}else {
				System.out.print(score[i]);
			}
		}
		for( i = 1; i < score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
			
		}
		System.out.println(" }");
			System.out.println(min);
			System.out.println(max);
			
	}
}


