package chapter2;

public class Example48 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(true) {
			sum +=(i%2==0)? -i : i;
			if(sum>=100) {
				break;
			}
			i++;
		
     }
		System.out.println(i);
  }
}
//		int sum=0;
//        int num=0;
// 
////        while(sum<100) {
////            ++num;
////            if(num%2==0) sum-=num;
////            else sum+=num;
////        }
////        System.out.println(num);
////	