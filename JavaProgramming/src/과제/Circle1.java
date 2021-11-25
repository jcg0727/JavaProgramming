package 과제;

public class Circle1 {

	private double radius;
	private double x;
	private double y;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		if (this.radius <= 0) {
			this.radius = 0;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getArea() {
		double getArea = this.radius * this.radius * Math.PI;
		return getArea;
	}

}
