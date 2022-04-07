package sec1;
//예외처리 : 혹시 모를 정상적인 실행을 하지 못할 경우의 대비책을 마련하고
//실해오디지 못할 때는 대비책을 가동하도록 하는 방안
public class ExceptionEX1 {
	public static void main(String[] args) {
		
		int i;
		int a = 20;
		int[] arr = {10,20,30};
		String b = "김기태";
		
		//예외상황(Exception) : 정상적인 실행을 하지 못하는 상황
		//1). 출력하는 내용에 null이 있어 실행할 수 없음 -> NullPointerException
		//2). 특정 데이터를 0으로 나누려고 해서 실행할 수 없음 -> ZeroDivideException
		//3). 배열 요소의 ㅣ정해진 범위를 벗어난 경우 실행할 수 없음 -> ArrayIndexOutOfBoundsExceptoin
		//4). 결과가 문자열과 같이 숫자의 형태로 가공없어 실행할 수 없음 -> NumberFormatException
		//5). 참조형에서 형변환이 되지 않는 경우가 발생해 실행할 수 없음 -> ClassCastException
		//6). 연결하거나 참조한 패키지에서 해당 클래스를 찾을 수 없어 실행할 수 없음 -> ClassNotFoundException
		
		
		//1). System.out.println("i = "+i);
		//2). System.out.println("a를 0으로 나눈 결과 : " +(a/0));
		//3). System.out.println("arr[5] : " +(arr[5]));
		//4). int c = b;
		//5). KumhoTire tire = new HankookTire();
		//	  HankookTire tire2 = tire;
		
		try {
			System.out.println(a/0);
			System.out.println(Integer.parseInt(b));
		}	catch(NumberFormatException e) {
			System.out.println("정수 변환 불가 데이터입니다.");
			System.out.println();
			e.printStackTrace();
		}	catch(ArithmeticException e) {
			System.out.println("0으로 나누려고 시도하였음");
		}	catch(Exception e) {
			e.printStackTrace();
		}
		
		//try { 실행문장; } catch(예외종류코드 e) { 예외를처리할구문; }
		
		
		
		
		
	}
}