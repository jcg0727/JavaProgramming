package 연습;

import java.util.Scanner;

public class 연습1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String com = " ";
		System.out.print("가위 바위 보를 입력하세요: ");
		String str = scanner.next();
		System.out.println("게이머: " + str);

		
			
		if(str.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("무승부");
	    		}else if(com.equals("보")) {
	    			System.out.println("결과: 철수 승리!");
	    		}else {
	    			System.out.println("결과: 영희 승리!");
	    		}
			}
		
		else if(str.equals("바위")){
			if(com.equals("바위")) {
				System.out.println("무승부");
				}else if(com.equals("가위")) {
					System.out.println("결과: 철수 승리!");
				}else {
					System.out.println("결과: 영희 승리!");
				}
			}
				
			else {
				if(str.equals("보")) {
					System.out.println("무승부");	
				}else if(com.equals("바위")) {
					System.out.println("결과: 철수 승리!");
				}else {
					System.out.println("결과: 영희 승리!");
				}
			}	
			
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
