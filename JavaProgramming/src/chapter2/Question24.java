package chapter2;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 year에 2020을 저장하여라.
			int year = 2020;
		//2. 변수 month에 2를 저장하여라.
			int month = 2;
		//3. 변수 day에 14를 저장하여라.
			int day = 14;
		//4. 변수 year, month, day를 문자열 조합을 이용하여 아래와 같이 출력하여라.
		//오늘날짜 : 2020년 2월 14일
			
	    System.out.print("오늘날짜 : " );
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day+"일 ");
		
		System.out.print("오늘날짜 : " + year+"년 " + month+"월 " + day+"일 ");
		
	}

}
