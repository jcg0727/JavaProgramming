package chapter3;

public class Question313 {

	public static void main(String[] args) {
		TimeVO tv = new TimeVO();
		tv.setHour(46);          
		tv.setMinute(112);
		tv.setSecond(4853);
		System.out.println("현재시간: " + tv.getHour() + "시" + tv.getMinute() + "분" + tv.getSecond() + "초");
	}

}
