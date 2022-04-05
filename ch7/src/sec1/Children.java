package sec1;
//class 클래스명 extends 부모클래스명 {	}
//부모 클래스 = 슈퍼 클래스
//자식 클래스 = 서브 클래스
//메인 클래스 = 실행 클래스
public class Children extends Parent{

	double field3;	//필드
	
	Children() {	}	//생성자
	
	Children(int field1, String field2, double field3){
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