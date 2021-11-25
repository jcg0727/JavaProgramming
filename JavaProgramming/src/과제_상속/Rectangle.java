package 과제_상속;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double area() {
		return 0.0;	
	}
	
	public double perimeter() {
		return 0.0;	
	}
	
	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레:"+(width*2+height*2) +"cm, 넓이: "+ (width * height) + "㎠";
	}

}
