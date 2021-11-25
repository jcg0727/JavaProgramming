package chapter2;

public class Question28 {

	public static void main(String[] args) {
		byte b1 = 80 ;
		byte b2 = 100;
		long lo1 = 642L;
		
	     int result1 = (int) lo1+b1;
		
		
		System.out.println(result1);
		
		System.out.println(b1+b2);
		
		int result2 = b1+b2;
		
		byte result3 = (byte)result2;
		
		System.out.println(result3);
		
		long lo2 = (long) 60000 * 80000;
		
		System.out.println(lo2);
		

	}

}
