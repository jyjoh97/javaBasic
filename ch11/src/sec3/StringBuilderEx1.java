package sec3;

public class StringBuilderEx1 {
	public static void main(String[] args) {
		String kim = "김기태";
		String lee = "이순신";
		System.out.println(kim+", "+lee);
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");						//추가 => append
		sb.append("Web ");
		sb.append("Programing");
		System.out.println(sb);
		
		sb.insert(4, "김");						//특정 위치에 삽입	=> insert
		System.out.println(sb);
		
		sb.setCharAt(4, '1');					//특정 위치의 문자를 변경 => setCharAt
		System.out.println(sb);
		
		sb.replace(10, 21, "Programmer");		//특정 번째 문자열들을 바꾸기	=> replace
		System.out.println(sb);
		
		sb.delete(4, 5);						//특정 범위에 있는 글자들을 삭제	=> delete
		System.out.println(sb);
		
		System.out.println("글자수 : "+sb.length());
		
		//StringBuilder를 String으로 변환
		String res = sb.toString();		
		System.out.println("문자열로 반환된 결과 : "+res);
		
		//String을 StringBuilder로 변환
		StringBuilder sb2 = new StringBuilder(res);	
		System.out.println(sb2);
	}
}