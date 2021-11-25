package 과제_인터페이스;

public abstract class Shape implements Comparable {
	public abstract double area();
	public abstract double perimeter();
	
	 
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
