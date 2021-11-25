package 과제;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		Random random = new Random();
		int mon = random.nextInt(11)+1;
		System.out.println(mon + "월");
		switch(mon) {
			case 1:
				System.out.println("31일 까지 있습니다.");
				break;
			case 2:
				System.out.println("28일 까지 있습니다.");
				break;
			case 3:
				System.out.println("31일 까지 있습니다.");
				break;
			case 4:
				System.out.println("30일 까지 있습니다.");
				break;
			case 5:
				System.out.println("31일 까지 있습니다.");
				break;
			case 6:
				System.out.println("30일 까지 있습니다.");
				break;
			case 7:
				System.out.println("31일 까지 있습니다.");
				break;
			case 8:
				System.out.println("31일 까지 있습니다.");
				break;
			case 9:
				System.out.println("30일 까지 있습니다.");
				break;
			case 10:
				System.out.println("31일 까지 있습니다.");
				break;
			case 11:
				System.out.println("30일 까지 있습니다.");
				break;
			default:
				System.out.println("31일 까지 있습니다.");
				break;
		}
		
		
		
		
		
		
	}

}
