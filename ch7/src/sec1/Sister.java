package sec1;

public class Sister extends Parent{

	double field3;	//필드
	
	Sister() {	}	//생성자
	
	Sister(int field1, String field2, double field3){
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}		//메소드
	
	@Override
	public void method2() {
		System.out.println("자식메소드2 입니다.");
	}
	
	public void method3() {
		
	}
	
	
	
}