package ch7;

public class Taxi extends Car2{

	int meter;
	int money;
	
	public int run() {
		System.out.println("택시가 달립니다.");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}	return 0;
	}
	
	
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}
	
}