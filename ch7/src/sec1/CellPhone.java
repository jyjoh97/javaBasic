package sec1;

public class CellPhone {
	
	String model;
	String color;
	
	
	

	public void mod(String mode) {
		System.out.println("모델 : "+mode);
	}
		
	public void col(String colo) {
		System.out.println("색상 : "+colo);
	}
	
	public void cha(int chan) {
		System.out.println("채널 : "+chan);
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String massage) {	//전달한 메시지 출력
		System.out.println(massage);
	}
	
	public void receiveVoice(String massage) { //전달받은 메시지 출력
		System.out.println(massage);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
	

}