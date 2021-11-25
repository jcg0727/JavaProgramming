package 연습;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car(){
	}

	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	 }
	
	 public void setSpeed(double speed) {
		 this.speed=speed;
	 }
	 
	 public String getColor() {
		 return color;
	 }

	 public void setColor(String color) {
		 this.color = color;
	 }

	public boolean speedUp(double speed) {
		if(speed < 0 || speed > MAX_SPEED) {
			 return false;
		 }else {
			 this.speed += speed;
			 return true;	
		 }
	 }
	public static double getMaxSpeed() {
		return MAX_SPEED;
	 }
	public String toString(){
		return "";
	}
}