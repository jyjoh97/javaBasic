package sec2;

public class SupersonicAirplane extends AirPlane{
	
	public final static int NORMAL = 1;
	public final static int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	

	
	/*
		부모 클래스인 AirPlane에서 fly 메소드를 변환하여 
		flyMode가 NORMAL이면 => 일반 비행을 하고
		SuperSonic이면 => 초음속 비행을 합니다.
		일반 비행모드인 경우 super 키워드 사용.
	 */

	

	
	@Override
	public void fly() {
		if(flyMode == NORMAL) {
			super.fly();
	}	else if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
	}
	
	
	
	
	
	
	
	
	
	}
}