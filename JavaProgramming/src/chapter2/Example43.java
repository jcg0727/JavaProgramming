package chapter2;

public class Example43 {

	public static void main(String[] args) {
		int dan = 2;
		while (dan < 10) {
			int gob = 1;
			while  (gob < 10) {
				System.out.println(dan + " * " + gob + " = " + dan * gob);
				gob++;
			}
			dan++;
		}
//		int dan = 2;
//		while(dan<10) {
//			int gob= 1;
//			while(gob<10) {
//				System.out.println(dan + " * " + gob + " = " + dan * gob);
//				gob++;
//	     	}
//			dan++;
//    	}
	}
}
