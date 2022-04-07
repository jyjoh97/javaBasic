package ch9;

public class Anonymous {
	//Vehicle field = 	//인터페이스의 익명의 객체 생성
	void method1() {	//메서드 호출시 인터페이스의 익명의 객체 생성
		//Vehicle localVar =
		//localVar.run();
	}
	void method2(Vehicle v) {	//메서드 호출시 인터페이스를 매개변수로 받아 메서드 실행 
		v.run();
	}
}