package sec2;

public class SonicEx {
	public static void main(String[] args) {
		
		SupersonicAirplane plane = new SupersonicAirplane();
		
		//AirPlane plane = new SupersonicAirplane();
		
		plane.takeOff();
		System.out.println("\n");
		
		plane.fly();	
		plane.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("\n");
		
		plane.fly();
		plane.flyMode = SupersonicAirplane.NORMAL;
		System.out.println("\n");
		
		plane.fly();
		System.out.println("\n");
		
		plane.landing();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}