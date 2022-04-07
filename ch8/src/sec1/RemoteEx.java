package sec1;

public class RemoteEx {

	public static void main(String[] args) {
		//1. 인터페이스타입으로 선언이 되었을 경우
		RemoteControl rc1;			
		//선언을 인터페이스 타입으로 했으므로 필드의 직접 접근이 불가능
		
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
	    
		//인터페이스에서 선언되었으므로 getVolume()과 setVolume()으로 접근 가능
		System.out.println("TV볼륨 : "+rc1.getVolume());
		
		//인터페이스에서 선언되어 있지 않으므로 getChannel()과 setChannel()을 사용 불가능
		//System.out.println("채널 : "+rc1.getChannel());
		
		rc1.turnOff();
		rc1 = new AudioRemote();
		rc1.turnOn();
		//rc1은 객체 생성을 새로 하였으므로 볼륨값은 다시 0으로 초기화 
		System.out.println("오디오 볼륨 : " +rc1.getVolume());
		rc1.turnOff();
		
		
		
		//2. 클래스 타입으로 선언이 되었을 경우
		TvRemote rc2 = new TvRemote();
		//선언을 클래스 타입으로 했으므로 필드의 직접 접근이 가능
		
		rc2.volume = 20;
		rc2.channel = 24;
		
		//형제끼리의 형변환은 허용X  -  크기가 다르기 때문
		//AudioRemote rc5 = (AudioRemote) rc2;
		RemoteControl rc4 = rc2; 	//자동 형변환
		
		
		
		//3. 내부 메서드에 의한 참조 / 값에 의한 전달
		//메소드를 호출하여 값을 전달 할 때 클래스로 묶어서 전달하는 것이 효울적이다.
		RemoteEx.play(rc2);							//call by reference
		RemoteEx.play(rc2.volume, rc2.channel);		//call by value
		System.out.println(rc2);
		
		
		
	}
	
	private static void play(TvRemote tv1) {		//참조(객체)에 의한 전달을 하는 메소드
		System.out.println("Tv의 볼륨 : "+tv1.volume);
		System.out.println("Tv의 채널 : " +tv1.channel);
		System.out.println("참조에 의한 전달로 플레이를 합니다.");
		
	}
	
	
	private static void play(int volume, int channel) {	//값에 의한 전달을 하는 메소드
		System.out.println("Tv의 볼륨 : "+volume);
		System.out.println("Tv의 채널 : " +channel);
		System.out.println("값에 의한 전달로 플레이를 합니다.");
	}
	
	
}




