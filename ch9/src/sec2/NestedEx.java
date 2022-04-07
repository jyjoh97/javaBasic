package sec2;
//중첩 클래스에서 내부클래스의 메소드가 외부 멤버의 접근 제한
class A{
	int item1;
	void func1() { System.out.println("기능1"); }
	static int item2;
	static void func2() { System.out.println("기능1"); }
	
	
	class B{
		
		void method() {	
			item1 = 1004;
			func1();
			item2 = 2008;
			func2();
		}
	}

	
	static class S {
		void method() {
			//item1 = 100;
			item2 = 200;
			//func1();
			func2();
			
		}
	}
	
	void method() {
		
		//로컬 클래스 : 내부 멤버에 public, private, static을 지정 불가하지만
		//외부 멤버를 접근하거나 활용할 수 있다.
		class L {	
			int field1;
			L() {	}
			void method1() {	
				item1 = 100;
				item2 = 200;
				func1();
				func2();
			}
		}
	}
}


public class NestedEx {
	public static void main(String[] args) {
		
		A a= new A();
		A.B b = a.new B();
		A.S s = new A.S();
		
		
		
		
	}
}
