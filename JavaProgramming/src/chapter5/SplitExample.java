package chapter5;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] sArr = str.split(",");
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}

}
