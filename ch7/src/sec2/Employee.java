package sec2;

public class Employee extends Human{
	
	public final static int EYE = 4;	
	//허용은 되나 부모 클래스의 
	//super.EYE는 여전히 2이고
	//this.EYE는 4로 별도로 지정
	
	
	
	@Override
	public void method1() {
		System.out.println("종업원1 입니다.");
	}
	
	
	
	
/*	
	부모 클래스인 Human 클래스에서 method2는 final로 지정된 메소드이므로
	오버라이딩 할 수 없음
	
		@Override
		public void method2() {
		System.out.println("회사원입니다.");
		}
*/	
	
	
	
	
	
	
	
	
	
	
	
}