package chapter3;

public class OverGo extends OverUp {
	int z = 3;
	

	String upMethod() {
		
		return x+y+z+":오버로딩";
	}
	
	
	String downMethod() {
		return "Basic";
	}
	
	String downMethod(int k) {
		return x+y+z+k+":오버로딩";
	}
}
