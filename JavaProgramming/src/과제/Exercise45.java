package 과제;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100)+1;
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
 
		for(num=num; num!=user;) {
			if(num<user){
				System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
				System.out.println("정답은 더 작은 수 입니다.");		
				user = scanner.nextInt();
		   }else{
			 System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			 System.out.println("정답은 더 큰 수입니다." );		
			 user = scanner.nextInt();
		   }		
	}
		System.out.println("정답입니다.");
		System.out.println("게임을종료합니다.");
		
	}			
}


