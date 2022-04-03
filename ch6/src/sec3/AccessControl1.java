package sec3;

import sec1.Animal;
//클래스, 필드, 생성자, 메서드

//public : 패키지가 달라도 import를 하면 사용이 가능하다.
//			=> 클래스, 필드, 생성자, 메서드

//protected : 자식 클래스에서만 상속 받은 범위 내에서만 사용이 가능하다.
//			=> 필드, 생성자, 메서드

//default : 같은 패키지에서만 사용이 가능하다.
//			=> 필드, 생성자, 메서드

//private : 같은 클래스에서만 사용이 가능하다. (접근제어)
//			=> 필드

//public > protected > default > private

class Data1{ 	//하나의 java 파일 안에 여러개의 클래스 서술이 가능하지만
				//	public 클래스는 하나만 있어야 한다.
	int field1;
}

class Data2{
	int filed2;
}


public class AccessControl1 {
	public static void main(String[] args) {
	
		
		Animal ca1 = new Animal();

	}
}