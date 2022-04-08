package sec3;
//java
public class StringEx1 {
	public static void main(String[] args) {
		
		byte[] bytes = { 74, 101, 107, 111, 34, 66 };
		char[] chars = { 'A', 'c', 'e' };
		
		//String 생성자는 문자배열이나 바이트배열을 문자열로 변환함.
		String str1 = new String(bytes);
		System.out.println("str1="+str1);
		
		String str2 = new String(chars);
		System.out.println("str2="+str2);
		
		//String(문자배열, 시작인덱스, 개수)
		String str3 = new String(bytes, 2, 3);	
		System.out.println("str3="+str3);
		
		//특정 인덱스 위치의 문자를 추출 => .charAt();
		String data = "김기태는 천사";								
		System.out.println(data.charAt(2));
	
		System.out.println("문자배열의 주소 : "+data.getBytes());
		
		//특정 문자의 위치를 반환 => .indexOf();
		System.out.println("태의 위치 : "+data.indexOf("태"));		
		
		//특정 문자열의 글자수를 반환 => .length();
		System.out.println("data의 글자 수 : "+data.length());	
		
		//특정 문자나 문자열을 치환 => .replace();
		String a =data.replace("기태","태균");			
		System.out.println(a);
			
		//begin 이상 ~ end 미만	=>	(n, n)
		String jumin = "123456-1234567";
		System.out.println("출생년도 : "+jumin.substring(0,1));
		
		System.out.println("성별 : ");
		int ma = Integer.parseInt(jumin.substring(7,8));
		switch(ma) {
			case 1 :
			case 3 : 
				System.out.println("남\n");
				break;
			case 2 :
			case 4 : 
				System.out.println("여\n");
				break;
			default : 
				System.out.println("잘못된 성별코드\n");
		}
		
		//end 생략시 끝까지 나옴	=> (n)
		System.out.println("주민번호 뒷자리 : " +jumin.substring(7));
		
		//대소문자 변환	=> .toLowerCase();, .toUpperCase();
		//문자 또는 숫자의 개수 => .length();
		//공백 제거 => .trim();
		String learn = "	Java Web programming	";
		System.out.println("소문자로 : " +learn.toLowerCase());
		System.out.println("대문자로 : " +learn.toUpperCase());
		System.out.println("글자 수 : " +learn.length());
		String kim = learn.trim();
		System.out.println("공백을 제거한 글자 수 : "+(kim.length()));
		System.out.println("공백을 제거한 텍스트 : " +kim);
		
		//b의 정수 1004를 문자열 "1004"로 변경(형 변환)	=>	.valueOf();
		int b = 1004;
		float c = 32.128f;
		String d = String.valueOf(b);
		
		//b의 문자열 "1004"를 정수 1004로 변경(형 변환)	=>	.parseInt();
		int e = Integer.parseInt(d);
		
		//c의 실수 32.128을 문자열 "32.128"로 변경(형 변환)	=>	.valueOf();
		String f = String.valueOf(c);
		
		//c의 문자열 "32.128"을 실수 32.128로 변경(형 변환)	=>	.parseFloat();
		float g = Float.parseFloat(f);
		
		//두 문자열을 비교	=>.equals();
		String name1 = "김기태";
		String name2 = "천사";
		if(name1.equals(name2)) {
			System.out.println("문자열이 같음");
		} else {
			System.out.println("문자열이 다름");
		}
		
		
		
		
		
	}
}