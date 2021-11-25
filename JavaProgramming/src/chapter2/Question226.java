package chapter2;

import java.util.Random;

public class Question226 {

	public static void main(String[] args) {

		int[] score = new int[7];		
	 Random random = new Random();
		float average = 0f;
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
				min = score[i];
			}
		}
	
		average = (int)(((float) sum / score.length)*100+0.5) / 100f;
		
		System.out.println(" }");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	
		
		
			
		
		
	}

}





