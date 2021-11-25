package chapter3;

public class MySingleton {
	
	private static MySingleton instance = new MySingleton(); //2내부에서 사용하기 위해 생성 , 3.new 생성전 static사용
	
	private MySingleton() { //1클래스 내에서만 가능		
	}
	public MySingleton getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
}
