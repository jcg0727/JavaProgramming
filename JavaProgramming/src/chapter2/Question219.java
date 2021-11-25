package chapter2;

public class Question219 {

	public static void main(String[] args) {
		// 1. 0이상 5이하에서 정수를 결과와 같이 출력하여라.
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		// 2. 0이상 5이하에서 정수를 결과와 같이 출력 하여라.
		for (int d=5; d>=0; d--) {
			System.out.print(d+" ");
		}
		System.out.println(" ");
		
		//3. 2이상 10이하의 정수를 합계를 구하여라.
		int sum = 0;
		for (int i = 2; i <=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//4. 5이상 15미만에서 정수의 곱을 구하여라.
		long a = 1;
		for (int i = 5; i < 15; i++) {
		a = a * i ;
		}
		System.out.println(a);
		
		//5. 3이상 4462이하에서 짝수인 정수의 합을 구하여라.
		int sum1 = 0;
		for (int i = 3; i <= 4462; i++) {
			if(i%2==0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);
		//6. 7초과 57미만에서 2또는 3의 배수인 정수의 합을 구하여라.
		int b = 0;
		for (int i = 8; i < 57; i++) {
			
			if((i%2==0)||(i%3==0)) {	
				b = b + i ;
		}
		}
		System.out.println(b);	
	}
}

