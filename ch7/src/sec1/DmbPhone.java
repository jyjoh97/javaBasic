package sec1;

public class DmbPhone extends CellPhone{

	int channel;
	
		
	
	public DmbPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	

	
	public void turnOnDmb(int channel) {
		System.out.println("현재 " +channel+"번 채널의 방송을 시작합니다.");
	}
	
	public void changeChannelDmb(int channel) {
		System.out.println("채널 " +channel+ "번으로 변경합니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	
	
}