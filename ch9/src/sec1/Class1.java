package sec1;

	class Classsub {
		int field1;
		String field2;
		double field3;
		
	}



public class Class1 {
	public static void main(String[] args) {
		
		Classsub sub1 = new Classsub();
		System.out.println(sub1.field1);
		mainMethod1();
	}
	
	public static void mainMethod1() {
		System.out.println("메인 메서드 호출");
	}
	
	
	
}