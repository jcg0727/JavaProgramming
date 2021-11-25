package chapter3;

public class HumanExample {

	public static void main(String[] args) {
		//Value Object(VO) == Data Transfer Object(DTO)
		//bean(객체)
		
		Human h1 = new Human(); 
		h1.name = "유지아";
		h1.age = 10;
		
		Human h2 = new Human();
		h2.name = "김태일";
		h2.age = 15;
		
		System.out.println(h2.age);
	}

}
