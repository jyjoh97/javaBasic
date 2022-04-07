package sec1;
//다중상속 : 여러개의 인터페이스를 하나의 클래스가 상속 받는 것
//인터페이스로부터 다중 상속을 받는 SmartTv는 
//반드시 두개의 인터페이스 선언내용이 모두 구현되어야 함
public class SmartTv implements RemoteControl, Searchable{

	private int volume;
	private int channel;
	
		
	@Override
	public void search(String url) {	}
	
	@Override
	public void turnOn() {	}
	
	@Override
	public void turnOff() {  }
	
	@Override
	public void setVolume(int volume) { 	}
	
	@Override
	public int getVolume() { return 1004;	}
	
	public int getChannel()	{ return channel; }
	
	public void setChannel() { this.channel = channel; }
	
	
	
	
	
}