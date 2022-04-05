package sec1;

public class Operator1 {
	public static void main(String[] args) {
		/*연산자
		
		************다 찾아보고 공부 해라 집가서 제발******************
		산술연산자 (+, -, *, /, %)
		논리연산자 (&&, ||, !, &, |, ^)			
		비교연산자 (>, >=, <, <=, ==, !==)		
		대입연산자 (=, +=, -=, *=, /=)
		증감연산자 (++, --)
		비트연산자 (&, |, ^, >>, <<, >>>)
		
		연산자의 우선순위 : 증감 > 산술 > 비교 > 논리 > 대입
		ex) a=30, b=20, c=10
			a>b && b>c  :  a가 b보다 크고, b가 c보다 클 때
							ㄴ 비교연산자 먼저 - 논리연산자 다음
		
		증감연산자와 산술연산자는 결과값이   숫자 / 문자 
		비교연산자와 논리연산자는 결과값이   true / false
		*/
		
		
		/*						1	2	3
		(입력 및 비교하는 개(항)수 : 단항, 이항, 삼항
		a = true;
		b = !a;       				단항
		a = 20;
		b = 30;
		c = a + b;					이항
		비교식 ? 참 : 거짓				삼항
		*/							
		
		int a = 20;
		int b = 30;
		String pass = a>b ? "a가 더 크다" : "b가 더 크다";
		System.out.println("비교결과 : " + pass);				//삼항
		
		boolean c = true;
		System.out.println("c의 반대 : " +(!c));				//단항
		
		int res = a + b;
		System.out.println("a+b = " + res); 				//이항
		
		
		
		
	}
}