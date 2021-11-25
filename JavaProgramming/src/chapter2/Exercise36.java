package chapter2;

public class Exercise36 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a+b);
		char ch = 'A';
		ch = (char) (ch+2);
		float f = (float)3 / 2 ;
		long l = 3000l*3000*3000;
		float f2 = 0.1f;
		double d = (float)0.1;
		boolean result = d==f2;
		
		System.out.println(c);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(l);
		System.out.println(result);
	}

}
