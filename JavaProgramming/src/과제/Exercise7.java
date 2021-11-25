package 과제;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요: ");
		String gamer = scanner.next();

		
		
		if(gamer.equals("가위")) {
			if("인공지능 컴퓨터: 가위".equals("인공지능 컴퓨터: 가위")) {
				System.out.println("게이머: 가위 ");
				System.out.println("인공지능 컴퓨터: 가위");
				System.out.println("결과: 무승부");
			}else if("인공지능 컴퓨터: 바위".equals("인공지능 컴퓨터: 바위")) {
				System.out.println("게이머: 가위 ");
				System.out.println("인공지능 컴퓨터: 바위");
				System.out.println("결과: 게이머 패배");
			}else if("인공지능 컴퓨터: 보".equals("인공지능 컴퓨터: 보")) {
				System.out.println("게이머: 가위 ");
				System.out.println("인공지능 컴퓨터: 보");
				System.out.println("결과: 게이머 승리");		
			}
		
		
		
		
		else if(gamer.equals("바위")) {
			System.out.println("게이머: 바위 ");
			System.out.println("인공지능 컴퓨터: 가위");
			System.out.println("결과: 게이머 승리");	
		}else if(gamer.equals("보")) {
			System.out.println("게이머: 보 ");
			System.out.println("인공지능 컴퓨터: 바위");
			System.out.println("결과: 게이머 승리");	
		}
		
	
		}
	}

}
