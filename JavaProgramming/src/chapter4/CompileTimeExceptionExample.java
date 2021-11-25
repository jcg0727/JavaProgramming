package chapter4;

public class CompileTimeExceptionExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
