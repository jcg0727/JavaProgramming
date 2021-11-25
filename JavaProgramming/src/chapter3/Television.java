package chapter3;

public class Television implements RemoteControl, Serchable{
	private int volume;

	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");	
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	

	/* (non-Javadoc)
	 * @see chapter3.Serchable#search(java.lang.String)
	 */
	@Override
	public void search(String word) {
		System.out.println(word + "의 검색 결과입니다.");
	}

}
