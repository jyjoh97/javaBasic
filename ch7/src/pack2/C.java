package pack2;

import pack1.A;
//import pack1.B;	
//		=>	B클래스는 접근제한자가 default이므로 다른 패키지에서 접근불가

class C {
	
	A a = new A();
	//a.field1;		=>	A클래스에 잇는 field1은 접근제한자가 protected이므로
	//					같은 패키지나 상속관계에서만 가능
	//a.method1();
	
	
	
	
	
	
	
	
	
	
	
	
}