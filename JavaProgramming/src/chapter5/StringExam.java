package chapter5;

public class StringExam{

	public static void main(java.lang.String[] args) {
		//기본형식으로 저장
		String a = "a";
		String b = "a";
		System.out.println(a==b);
		
		
		//객체저장(주소값 비교하여 false나옴).기본형임.메모리를 많이 차지함
		String aa = new String("a");
		String bb = new String("a");
		System.out.println(aa==bb);
		
		//문자열음 equals 이용하여 비교해야함.
		System.out.println(aa.equals(bb));

	}

}
