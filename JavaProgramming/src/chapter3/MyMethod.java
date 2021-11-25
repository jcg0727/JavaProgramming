package chapter3;

public class MyMethod {
	public static void main(String[] args) {
		MyMethod method = new MyMethod();
		method.method2(100);
		method.method3(100); // static으로 생성하여 경고문뜸
		MyMethod.method3(100); // 위가 아닌 다음과 같이 사용함.
	}
	void method1(int num){                                                       // 아무것도 반환하지 않는 변수를 선언하기 위해 void 입력.
		System.out.println("입력된 값은" + num + "입니다.");
	}
	void method2(int num){
		MyMethod.method3(200); // method3는 static 으로 선언되서 사용 가능
		method1(20);
		System.out.println("입력된 값은" + num + "입니다.");
	}
	static void method3(int num) {
		MyMethod method = new MyMethod(); // 생성필요
		method.method2(100); // method.을 붙여야함
		System.out.println(num *3);
	}
	
}

//static 이란 용어는 고정된이다. 어떤 정보를 다른사람에게 공개를 할때. ex)종이를 혼자 가지고 있다가 게시판에 공개.누구나 볼수 있게끔