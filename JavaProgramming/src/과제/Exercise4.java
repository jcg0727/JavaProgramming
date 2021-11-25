package 과제;

import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(8)+2;
		
		System.out.println(num + "단");
		
		
		for (int i = num; i < 10;) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+i*j );
			}
			break;
		}
		

	
	}

}
