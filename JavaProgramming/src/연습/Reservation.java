package 연습;

import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		int seat[] = new int[10];
		int reserved;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0 )");
			int res = input.nextInt();
			if (res == 1) {
				System.out.println("현재의 예약상태는 다음과 같습니다.");
				System.out.println("=============================");
				for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
					System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
				}                                 //    } 
				System.out.println();
				System.out.print("몇 번째 좌석을 예약하시겠습니까?");
				reserved = input.nextInt();
				if (seat[reserved - 1] == 0) {
					seat[reserved - 1] = 1;
					System.out.println("예약되었습니다.");
				} else if (seat[reserved - 1] == 1) {
					System.out.println("이미 예약된 좌석입니다.");
				}
			} else if (res == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("1 또는 0을 선택해주요");
			}
		}
	}
}