package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		
		
		//Singleton은 객체를 한번에 한개만 생성 가능
		//아무리 객체를 계속 다른이름으로 생성해도 어차피 같은 객체가 됨
		//또한 static은 정적 데이터가 되므로, 객체가 달라도 같은 저장소를 공유하고 있어
		//공유메모리이며, 정적 필드의 값은 객체가 달라도 같다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		obj1.num= 1004;
		
		if(obj1 == obj2) { 
			System.out.println("obj1 == obj2");
		}	else {
			System.out.println("obj1 != obj2");
		}
		
		System.out.println(obj2.num);
		obj2.num=2008;
		System.out.println(obj1.num);

	}

}
