package chapter5;

import java.util.regex.Pattern;

public class Question52 {

	public static void main(String[] args) {
		//1
		System.out.println(Pattern.matches("[A-Za-z]{3}", "sss"));
		//2
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", "010-1234-5678"));
		//3
		System.out.println(Pattern.matches("[01]{2}[01789]{1}-[1-9]{3}-[0-9]{4}", "010-123-5678"));
		//4
		System.out.println(Pattern.matches("[0-9]{6}-[1-4]{1}[0-9]{6}", "991122-2845736"));
		//5
		System.out.println(Pattern.matches("[A-Za-z]+[-_\\.]*[A-Za-z0-9]*@[A-Za-z]{1,7}.[A-Za-z]{2,3}(.kr)?", "s_3274b@ddit.or.kr"));
	}

}
