package test;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// 3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		//단, names와 subjects의 길이를 이용하여라.
		
		String[] names = {"정창균", "김태일", "김혜지", "이승은", "정현희", "한희수"};
		String[] subjects = {"국어","영어","수학","사회","과학","Oracle","Java"};
		
		
//		int[][] score1 = new int [6][7];	
		int[][] score = new int [names.length][subjects.length];			
		Random random = new Random();
		int i = 0;
		int j = 0;
		// scores의 모든 요소에 0~100 사이의 임의의 정수 값을 저장하여라.
		for(i = 0; i < names.length; i++) { 
			for ( j = 0; j < subjects.length; j++) {
				score[i][j] = random.nextInt(101);
				
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}

}
