package chapter2;

public class Question220 {

	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++) {
			if(dan%2==0) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + "=" + dan * i);
			}
			}
	}
		System.out.println();
		
		for (int dan = 2; dan < 10; dan++) {
			
			if(dan%2==0) {
				for (int i = 1; i < 10; i++) {
					if(i%2 !=0) {
						System.out.println(dan + " * " + i + "=" + dan * i);
					}
					
				}
				
		}
 }
		
}
}