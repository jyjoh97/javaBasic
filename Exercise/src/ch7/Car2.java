package ch7;

public class Car2 {
	
	Tire[] tires = {
			new Tire("앞 왼쪽", 20), new Tire("앞 오른쪽", 15),
			new Tire("뒤 왼쪽", 19), new Tire("뒤 오른쪽", 17),
	};
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
			return 0;
	}
		
		
		
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	
	
	
	
	
}