package 과제_인터페이스;

import kim.chopper.MyArrays;

public class Person {
	private String name;
	private double height;
	
	public Person() {		
	}

	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 키: " + height;
	}
	
	public String getTallest(Person[] people) {
		int maxIndex = MyArrays.getMaximum(people);
		return people[maxIndex].name;
	}
	
}
