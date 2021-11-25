package chapter2;

public class Exercise55 {

	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		int money = 2790;
		
		System.out.println("500원: " + money / coinUnit[0] + "개"); 
		System.out.println("100원: " + (money-(money / coinUnit[0]) * 500)/coinUnit[1] + "개");
		System.out.println("50원: "+ ((money-(money / coinUnit[0]) * 500)-(money-(money / coinUnit[0]) * 500)/coinUnit[1]*100) / coinUnit[2] + "개");
	
		
		
	}

}

//for(int i = 0; i<coinUnit.length;i++) {
//	System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i] + "개";
//	money = money %coinUnit[i];
//}