package chapter3;

//VO -> DTO(data transfer object)
//DateVO -> 년, 월, 일 ,요일
public class TimeVO {
	private int hour;
	private int minute;
	private int second;
		
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour >= 0 && hour <24)
		this.hour = hour;
	}
	
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0) {
			return;
		}else if(minute<60) {
			this.minute = minute;
		}else {
			this.hour = minute / 60;
			this.minute = minute%60;
		}
	}
	
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0) {
			return;
		}else if(second<60) {
			this.second = second;
		}else {
			this.second = second % 60;
			setMinute(second/60);
		}
		 
	}
}








//	private int hour;
//	private int minute;
//	private int second;
//	
//	public int getHour() {
//		return hour;
//	}
//	
//	public void setHour(int hour) {
//			this.hour=hour/24;
//	}
//	
//	
//	public int getMinute() {
//		return minute;
//	}
//	
//	public void setMinute(int minute) {
//		if(minute>=0 && minute<=59){
//			this.minute=minute;
//		}else if(minute>=60) {
//			this.minute =minute%60 + second/60;
//		}
//	}
//	
//	
//	public int getSecond() {
//		return second;
//	}
//	public void setSecond(int second) {
//		if(second>=0 && second<=59){
//			this.second=second;
//		}else if(second>60) {
//			this.second=second % 60;
//		}
// }
//}