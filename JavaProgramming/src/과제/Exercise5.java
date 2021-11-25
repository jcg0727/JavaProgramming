package 과제;

public class Exercise5 {

	public static void main(String[] args) {
		int[] num = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};

		int max =num[0];
		int min =num[0];
		
		for (int i = 0; i < num.length; i++) {
			if(max<num[i]) { 
				max = num[i];
			}else if(min>num[i])
				min = num[i];
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

		
	}

}
