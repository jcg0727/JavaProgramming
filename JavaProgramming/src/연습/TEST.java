package 연습;

import java.util.ArrayList;
import java.util.Scanner;

import 프로젝트.GoodsDAO;

public class TEST {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int select = scanner.nextInt();
		String input = null;
		while(true) {
			if (select==1) {
				input = scanner.next();				
			}
	
		
		list.add(input);

		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		}
}
}