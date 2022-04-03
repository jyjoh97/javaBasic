package sec4;

//애너테이션(Annotation) : 컴파일러에게 앞으로 전개될 내용이 무엇인지 사전에 고지하는 것들

import java.lang.reflect.Method;

public class AlimEx1 {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			System.out.println(method.getName());
		}
	
		String kim; //문자열(String)은 기본형(X), 참조형(△)
		//String은 
	
	}
}