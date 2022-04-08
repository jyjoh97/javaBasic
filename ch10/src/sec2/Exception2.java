package sec2;

public class Exception2 {
	//method2()가 실헹되다가 실제 실행되는 내용인 method1()이 실행되고
	//예외가 발생할 경우 다시 method1()로 돌아와 예외를 처리하게 된다.
	//					=> 예외 떠넘기기
	//예외 떠넘기기 (throws 구절) : 메소드명 throws 예외종류 {	 }
	//처리 내용에 문제가 발생하면 throws 구절을 이용하여 해당 예외를 자바에서 처리하게 떠넘긴다
	
	public static void method1() throws ClassNotFoundException {
		Class cla1 = Class.forName("java.lang.String2");
	}
	
	
	public static void method2() {
		try {
			method1();
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 기타예외");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
	
	}
}