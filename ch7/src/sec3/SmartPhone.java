package sec3;

public class SmartPhone extends Phone{

	
	
	SmartPhone(String owner){
		super("조재영");
	}

	
	@Override
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
	
	
	

	
	
	
}