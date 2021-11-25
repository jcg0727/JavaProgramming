package chapter5;

public class StringConverterExam {
	public static void main(String[] args) {
		String data1 = "200";
		int intData1 = Integer.parseInt("200");
		System.out.println(intData1);
		
		
		
		int data2 = 150;
		//String strData2 = data2+"";
		//String strData2 = Integer.toString(data2);
		String strData2 = String.valueOf(data2);
				
		System.out.println(strData2);
	}
}
