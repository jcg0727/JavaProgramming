package 과제_인터페이스;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 2*Math.PI*radius;	
	}
	
	public double perimeter() {
		return radius*radius*Math.PI ;	
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레:"+area() +"cm, 넓이: "+ perimeter() + "㎠";
	}

	

}
