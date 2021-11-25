package 프로젝트;

import java.util.List;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) throws Exception {
		
			
			
			
			
		Main main = new Main();
		main.menu();
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		if (a==1) {
			main.admin();
		}else {
			
			main.emp();
			
				
		}

		
	}


}
