package chapter2;

public class Example41 {

	public static void main(String[] args) {
		//(1)		
		int x =11;
		if(x > 10 && x <20) {
			System.out.println("true");
		}
		//(2)
		char ch = ' ';
		if(ch==' ' && ch!='\t') {
			System.out.println("true");
		}
			
		//(3)
		char ch = 'x';
		 if(ch=='x' || ch=='X') {
			 System.out.println("true");
		 }
		
		//(4)
		ch=(char)'9';
		 if (ch>='0' && ch<='9') {
			 System.out.println("true");
		 }

		//(5)
		ch = (char)'Z';
		 if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			 System.out.println("true");
		 }
		
		//(6)
		boolean powerOn = false;
		if(powerOn == false) {
			System.out.println("true");	
		}	
		//(7)
		
		String str = "yes";
		if(str == "yes") {
			System.out.println("true");	
		}
		
		
		
		
	}

}
