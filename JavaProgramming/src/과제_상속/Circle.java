package 과제_상속;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 0.0;	
	}
	
	public double perimeter() {
		return 0.0;	
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레:"+(2*Math.PI*radius) +"cm, 넓이: "+ (radius*radius*Math.PI) + "㎠";
	}

	
	
}
