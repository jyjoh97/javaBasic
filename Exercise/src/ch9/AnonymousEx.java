package ch9;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();	//익명의 객체안의 메서드 호출
		anony.method1();	//메서드 호출로 익명의 객체를 만들어 실행
		anony.method2();	//메서드 호출로 인터페이스를 매개변수로 지정하여 전달한 후 해당 메서드에서 실행
	}
}