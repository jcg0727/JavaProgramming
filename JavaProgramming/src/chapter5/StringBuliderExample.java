package chapter5;

public class StringBuliderExample {

	public static void main(String[] args) {
		
//		String str = "";
//		for (int i = 1; i <=100; i++) {
//			str += i;
//		}
//		System.out.println(str);
		
		
		String str = "";
		StringBuilder strBi = new StringBuilder(str);
		for (int i = 1; i <=100; i++) {
			strBi.append(i);
		}
			System.out.println(strBi);
	}

}
