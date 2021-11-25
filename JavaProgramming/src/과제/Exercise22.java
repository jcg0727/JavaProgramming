package 과제;

public class Exercise22 {

	public static void main(String[] args) {
		
		double distance = 40e12;
		double speed = 300000;
		double num = distance / speed;
		double year = num/(60*60*24*365);
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은" + year + "광년이다.");
			
	}

}

