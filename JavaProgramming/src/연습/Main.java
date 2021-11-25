package 연습;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(8)+2;
		for (int i = a ; a < 9; i++) {
			for(int j = 1; j < 10; j++)
				System.out.println(i +"*"+ j +"="+ i*j );
		}
		
	}

}



