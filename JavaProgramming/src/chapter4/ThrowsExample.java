package chapter4;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
		throw new Exception();
	}
	
	public static void findClass(){
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) { // 부모여서 사용 가능 위에와 위치 바뀌면 에러발생
			e.printStackTrace();
		}   
	}

}
