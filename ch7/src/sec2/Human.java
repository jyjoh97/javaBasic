package sec2;

public class Human {

	String name;
	String jumin;
	int age;
	public final static int EYE = 2;
	
	
	//this(); 를 사용해 생성자를 호출
	Human(){
		this("jaeyoung");
	}
	
	Human(String name){
		this(name, "970205-1041514");
	}
	
	Human(String name, String jumin){
		this(name, jumin, 26);
	}
	
	Human(String name, String jumin, int age){
		this.name = name;
		this.jumin = jumin;
		this.age = age;
	}
	
	
	public void method1() {
		System.out.println("인간 객체입니다.");
	}
	
	public final void method2() {
		System.out.println("두 개의 눈을 가진 사람입니다.");
	}
	
	
	
	
	
	
	
	
	
	
}