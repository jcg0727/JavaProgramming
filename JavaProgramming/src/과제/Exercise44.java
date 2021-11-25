package 과제;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String str2 = scanner.next();
		
		System.out.println("가위 바위 보 게임");
		System.out.println("철수: " + str);
		System.out.println("영희: " + str2);
		
			
		if(str.equals("가위")) {
			if(str2.equals("가위")) {
				System.out.println("무승부");
	    		}else if(str2.equals("보")) {
	    			System.out.println("결과: 철수 승리!");
	    		}else {
	    			System.out.println("결과: 영희 승리!");
	    		}
			}
		
		else if(str.equals("바위")){
			if(str2.equals("바위")) {
				System.out.println("무승부");
				}else if(str2.equals("가위")) {
					System.out.println("결과: 철수 승리!");
				}else {
					System.out.println("결과: 영희 승리!");
				}
			}
				
			else {
				if(str.equals("보")) {
					System.out.println("무승부");	
				}else if(str2.equals("바위")) {
					System.out.println("결과: 철수 승리!");
				}else {
					System.out.println("결과: 영희 승리!");
				}
			}	
			
	
		
		
		
	}

}
