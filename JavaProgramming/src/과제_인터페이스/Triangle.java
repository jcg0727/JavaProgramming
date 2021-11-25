package 과제_인터페이스;

public class Triangle extends Shape{
	
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	public double area() {
		return Math.sqrt(3)/4*side*side;	
	}
	
	public double perimeter() {
		return side*3;	
	}
	
	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레:"+perimeter() +"cm, 넓이: "+ area() + "㎠";
	}


}
