package sec2;

//super();  =>  부모 클래스의 생성자 호출
//this();	=>  현재 클래스의 생성자 호출
//super.	=>  부모 클래스의 필드
//this.		=>  현재 클래스의 필드
//super.메소드명();	=> 부모 클래스의 메소드 호출
//this.메소드명();		=> 현재 클래스의 메소드 호출

public class Student extends Human{
	
	String no;
	String part;
	
	Student(){
		
	}
	
	Student(String name, String jumin, int age, String no,
			String part){
		super(name, jumin);	//부모 클래스의 생성자 => super(매개변수1, 매개변수2)
		super.age = age;	//부모 클래스의 필드 	 => super.필드명
		//super(name, jumin, age);
		this.no = no;
		this.part = part;
	}
	
	public void method1() {
		System.out.println("학생 객체(인스탠스)입니다.");
	}
	
//	public void method2() {		=> 부모클래스인 Human에서 method2를 
//		super.method1();				final로 지정했기 때문
//	}
	
	public void method3() {
		this.method1();
	}
		

	
	
	
	
	
	
}