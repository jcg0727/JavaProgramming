package chapter3;

public class Init {
	static int action;
	int action2 = 5;
	
	
	static {
		action = 4;
	}
	
	{
		action2 = 4;
	}
	
	Init(){
		action2 = 7;
	}
	
	Init(int action2){
		this();
		this.action2 = action2;
	}
	
}

