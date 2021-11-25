package chapter3;

public class TVExample {

	public static void main(String[] args) {
		//TV클래스를 객체로 만듬
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();
		TV tv4 = new TV();
		TV tv5 = new TV();
		TV tv6 = new TV();
		TV tv7 = new TV();
		//.을 붙이면 tv에 설계되어잇던 3개의 변수가 나옴
		tv1.channel = 10;
		tv1.volume = 30;
		
		//클래스의 값을 지정하지 않으면 기본값 출력됨.
		System.out.println(tv2.model);
		System.out.println(tv1.volume);
		
	}

}
