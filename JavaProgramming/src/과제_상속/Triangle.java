package 과제_상속;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	public double area() {
		return 0.0;	
	}
	
	public double perimeter() {
		return 0.0;	
	}
	
	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레:"+(side*3) +"cm, 넓이: "+ (Math.sqrt(3)/4*side*side) + "㎠";
	}

}
