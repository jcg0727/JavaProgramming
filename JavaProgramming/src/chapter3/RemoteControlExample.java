package chapter3;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl audio = new Audio();
		audio.turnOff();
		audio.turnOn();
		
		RemoteControl tv = new Television();
		tv.turnOff();
		tv.turnOn();
		tv.setVolume(20);
		tv.setMute(true);
		RemoteControl.changeBattery();
	}

}
