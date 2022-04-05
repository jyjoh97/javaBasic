package sec1;

public class Parent {
	
	int field1;
	String field2;
	
	Parent(){	}
	
	Parent(int field){
		this.field1 = field1;
	}
	
	Parent(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
	
	public void method1() {
		System.out.println("부모메소드1");
		System.out.println("부모메소드2");
	}
	
	public void method2() {
		System.out.println("자식메소드1");
		System.out.println("자식메소드2");
	}

}