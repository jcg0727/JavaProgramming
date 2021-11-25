package 과제_예외처리;

public class Calc {
	int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	int substract(int a, int b) {
		int result = a-b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a * b;
		return result;
	}
	
	double divide(double a, double b) {
		double result = a / b;
		double result1 = (int)(result *10+0.5) / (double)10;
		return result1;
	}
	
	
	
}
