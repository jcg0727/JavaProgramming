package chapter3;

public class Example318 {

	public static void main(String[] args) {
		FireEngine2 fe = new FireEngine2();
		Car2 c2 = new Car2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("이것은 파이어엔진의 인스터스이다.");
			FireEngine2 fe2 = fe;
		}
		if(fe instanceof Car2) {
			System.out.println("이것은 카의 인스터스이다.");
			Car2 fe2 = fe;
		}
		if(fe instanceof Object) {
			System.out.println("이것은 오브젝트의 인스터스이다.");
			Object fe2 = fe;
		}	
//		if(c2 instanceof FireEngine2) {
//			System.out.println("fe 는 c2의 인스턴스이다.");
//			FireEngine2 fe2 = c2 ;
//		}	
		if(c2 instanceof Object) {
			System.out.println("c2는 Object의 인스터스이다.");
			Object fe2 = fe;
		}	
	}

}
