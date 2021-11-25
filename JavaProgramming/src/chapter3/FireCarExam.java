package chapter3;

public class FireCarExam {

	public static void main(String[] args) {
		Ccar c = new FireCar(); // 부모타입으로 선언 필요
		c. // 자식타입을 사용할수 없음
		FireCar f = (FireCar) c; // 자식타입으로 형변환 필요
		f.water();
	}

}
