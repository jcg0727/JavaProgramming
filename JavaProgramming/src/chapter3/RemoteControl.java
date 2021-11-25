package chapter3;

//abstract class => interface
public interface RemoteControl { //클래스라고 써도 똑같음. 특별한 클래스. 추상클래스와 비슷. 변수를 사용 못함. 동작형태만 정의.
	//필드(변수)는 불가능하지만 상수는 가능
	//public static final 생략 가능
	int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;
	
	//public abstract => 생략
	void turnOn();                     //정의만 해주면 됨. 이 스펙대로 객체를 만들어 주면 됨. public abstract가 생략되어 있음. public은 사용 하지 않는게 좋음.
	void turnOff();
	void setVolume(int volume);
	
	
	//JDK 1.8부터 추상메소드가 아닌 이란 메소드도 선언 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 모드");
		}else {
			System.out.println("음소거 해제");
		}	
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
}
