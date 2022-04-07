package sec1;

public class DmbPhoneEx{

	public static void main(String[] args) {
		
		String note = "Samsung Galaxy Note20 Ultra 5G";
		String black = "검정";
		int cha = 777;
		String mas1 = "'여보세요'";
		String mas2 = "'안녕하셨습니까?'";
		
		DmbPhone dmb1 = new DmbPhone(note, black, cha);
		
		
		System.out.println("모델명 : "+dmb1.model);
		
		//dmb1의 모델 색상 채널 출력
		dmb1.mod(note);
		dmb1.col(black);
		dmb1.cha(cha);
		System.out.println("\n");
		//dmb1의 전원을 켜도록 메소드 호출
		dmb1.powerOn();
		//dmb1에서 '벨이 울립니다'가 출력될 수 있도록 메소드 호출
		dmb1.bell();
		//dmb1에서 '여보세요'를 보내고 출력할 수 있도록 메소드 호출
		dmb1.sendVoice(mas1);
		//dmb1에서 '안녕하셨습니까?'를 받고 출력할 수 있또록 메소드 호출
		dmb1.receiveVoice(mas2);
		//dbm1의 통화가 끝날 수 있도록 메소드 호출
		dmb1.hangUp();
		//dmb1의 dmb가 시작될 수 있도록 메소드 호출
		dmb1.turnOnDmb(cha);
		//dmb1의 채널이 12번으로 변경될 수 있도록 메소드 호출
		dmb1.changeChannelDmb(cha);
		//dmb1의 dmb가 종료될 수 있또록 해당 메소드 호출
		dmb1.turnOffDmb();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}