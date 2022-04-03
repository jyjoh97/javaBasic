package sec1;

public class Logical1 {
	public static void main(String[] args) {
		//논리연산 : (&&, ||, !, &, |, ^)
		
		//XOR : 서로 입력값이 다를 경우 1, 같을 경우 0
		// OR : 서로 
		//AND : 
		//NOT : 
//(Complement)(2진수의 NOT만)
		
		//32   16	8	4	2	1
		//a		1	1	1	1	0
		//b		1	0	1	0	0
		
		
		
		//NOT	0	0	0	0	1 =>	
		//AND	1	0	1	0	0 =>	20
		// OR	1	0	1	1	0 => 	30
		//XOR	0	1	0	1	0 =>	10
		
		int a = 30;			//11110
		int b = 20;			//10100
		int c = 10;			//
		System.out.println("a와 b의 OR 연산 : "+(a & b));
		System.out.println("a와 b의 AND 연산 : " +(a & b));
		System.out.println("a와 b의 XOR 연산 : "+(a ^ b));
		System.out.println("~a -> a의 보수(NOT) : "+(~a));
		
		
		
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
	
		System.out.println("&& => AND연산의 결과1 : "+(d && e));
		System.out.println("&& => AND연산의 결과2 : "+(d && f));
		System.out.println("&& => AND연산의 결과3 : "+(f && d));
		System.out.println("&& => AND연산의 결과4 : "+(f && f));
		
		/*
		 &&(AND)연산은 입력값이 모두 참일 때만 결과가 참
		입력1			입력2			입력3
		true		true		true
		true		false		false
		false		true		false
		false		false		false
		*/
				
		System.out.println("|| => OR연산의 결과1 : "+(d || e));
		System.out.println("|| => OR연산의 결과2 : "+(d || f));
		System.out.println("|| => OR연산의 결과3 : "+(f || d));
		System.out.println("|| => OR연산의 결과4 : "+(f || f));
		
		/*
		 ||(OR)연산 : 하나라도 참이 있으면 결과값이 참(true)
		입력1			입력2			입력3
		true		true		true
		true		false		true
		false		true		true
		false		false		false
		*/
		
		System.out.println("! => NOT연산의 결과1 : "+(!d));
		System.out.println("! => NOT연산의 결과2 : "+(!f));
		
		/* 
		  !(not) : 입력된 논리값을 true -> false, false -> ture 반대로 반환
		 입력			출력
		 true		false
		 false		true
		 */
		
		
	}
}