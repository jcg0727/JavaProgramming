package chapter2;

public class Question212 {

	public static void main(String[] args) {

		char x = 'ㅡ';
		
		String result = (x>=65 && x<=90) ? "대문자"  : (x>=97 && x<=122) ? "소문자" : "영문자 아님" ;
			
			System.out.println(result);

	}

}
