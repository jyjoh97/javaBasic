package sec4;
//Abstract(추상화) Class : 자세한 실행내용 또는 값을 미리 지정하면 
//나중에 이 클래스를 상속받아 재사용할 경우 수정내용 또는 메소드의 실행방법이나 결과를 모두 편집하거나 오버라이딩을 해야 하므로 
//재사용에 어려움이 많이 발생하여 구체적인 내용은 기술하지 않고 추상적이게 선언만 해서 
//상속받는 모든 클래스에서 사용할 수 있도록구체적인 내용을 기술해서 사용해야 하는 클래스
public abstract class Abstract1 {	//추상화 클래스
	
	int field;
	
	Abstract1(){
		
	}
	
	abstract void method1();	//abstract가 붙어 추상화된 메소드이고
								//{}대신 ;으로 마무리 한다.
	
	
	
	
	
}