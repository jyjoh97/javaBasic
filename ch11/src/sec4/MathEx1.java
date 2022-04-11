package sec4;

public class MathEx1 {
	public static void main(String[] args) {
		
		//.abs(); = 부호(-)를 없애고 절대값(6)으로 표현
		int v1 = Math.abs(-6);
		double v2 = Math.abs(-6.28);
		
		System.out.println("절대값");
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		System.out.println("\n");
		
		//.ceil(); = 올림처리됨
		System.out.println("올림");
		System.out.println("6.3 => "+Math.ceil(6.3));
		System.out.println("-6.3 => "+Math.ceil(-6.3));
		System.out.println("\n");
		
		//.floor(); = 내림처리됨
		System.out.println("내림");
		System.out.println("6.3 => "+Math.floor(6.3));
		System.out.println("-6.3 => "+Math.floor(-6.3));
		System.out.println("\n");
		
		//.rint(); = 반올림하여 실수로 변환
		System.out.println("반올림(실수로)");
		System.out.println("6.3 => "+Math.rint(6.3));
		System.out.println("-6.3 => "+Math.rint(-6.3));
		System.out.println("6.8 => "+Math.rint(6.8));
		System.out.println("-6.8 => "+Math.rint(-6.8));
		System.out.println("\n");
		
		//.round(); = 반올림하여 정수로 변환
		System.out.println("반올림(정수로)");
		System.out.println("6.3 => "+Math.round(6.3));
		System.out.println("-6.3 => "+Math.round(-6.3));
		System.out.println("6.8 => "+Math.round(6.8));
		System.out.println("-6.8 => "+Math.round(-6.8));
		System.out.println("\n");
		
		//.max(); = 가장 큰 수 구하기
		System.out.println("도수분포에서 가장 큰 수 => "+Math.max(8,9));
		
		//.min(); = 가장 작은 수 구하기
		System.out.println("도수분포에서 가장 작은 수 => "+Math.min(8,9));
		System.out.println("\n");
		//0~1까지 아무 수나 무작위로 나타내는 수
		System.out.println("랜덤 수 => "+Math.random());
		System.out.println("\n");
		
		for(int i=0; i<100; i++) {
			System.out.println("랜덤 수"+i+" : "+((int) (Math.random()*9)+1));
		}
		System.out.println();
		for(int i=0; i<6; i++) {
			System.out.print(((int) (Math.random()*45)+1)+"\t");
		}
		
	}
}