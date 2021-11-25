package chapter3;

public class SelfCar extends Vehicle{

	// Vehicle에 run 생성시 에러가 나지 않지만 추상클래스로 생성시 에러 발생하여 아래와 같이 만들어 줘야함.
	
	@Override
	public void run() {
		System.out.println("내 자동차가 달립니다.");
		
	}

}
