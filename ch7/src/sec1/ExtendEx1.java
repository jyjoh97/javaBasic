package sec1;

public class ExtendEx1 extends Parent{

	public static void main(String[] args) {
		Parent p1;		//객체 선언
		//선언만 하고, 갱체 생성을 하지 않았으므로 실행은 안됨

		//부모 클래스로 유도된 객체는 자식 클래스간의 캐스팅 가능
		//같은 부모 클래스로부터 유도된 것은 형제자매클래스끼리도 캐스팅 가능
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p1 = new Children();	//객체 캐스팅
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
		
		
		
		
	}

}
