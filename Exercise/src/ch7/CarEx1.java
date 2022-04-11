package ch7;

public class CarEx1 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		for(int i=1; i<110; i++);{
			int error = car1.run();
			System.out.println(error);
			switch(error) {
				case 1 : 
					System.out.println("앞 왼쪽 타이어 교체");
					break;
				case 2 : 
					System.out.println("앞 오른쪽 타이어 교체");
					break;
				case 3 : 
					System.out.println("뒤 왼쪽 타이어 교체");
					break;
				case 4 : 
					System.out.println("뒤 오른쪽 타이어 교체");
					break;
				default:
					System.out.println("default");
					break;
			}
			System.out.println("===========================================");
		}
		
		
		Tire tire0 = new Tire("타이어", 50);
		Tire tire1 = new KumhoTire("금호타이어");
		Tire tire2 = new MichelinTire("미쉐린타이어");
		Tire tire3 = new HankookTire("한국타이어");
		MichelinTire tire4 = new MichelinTire("미쉐린타이어");
		
		
		//객체명 instanceof 클래스명 : 특정 클래스로부터 만들어진 인스턴스인지 비교
		
		System.out.println("tire0는 Tire 클래스로부터 만들어진 인스턴스 인가? : "+
		(tire0 instanceof Tire));
		System.out.println("tire4는 Tire 클래스로부터 만들어진 인스턴스 인가? : "+
		(tire4 instanceof Tire));
		System.out.println("tire4는 Tire 클래스로부터 만들어진 인스턴스 인가? : "+
		(tire4 instanceof MichelinTire));
		//System.out.println("tire4는 Tire 클래스로부터 만들어진 인스턴스 인가? : "+
		//(tire4 instanceof HankookTire));
		
		
		tire1 = new MichelinTire("미쉐린타이어");	
		//부모 클래스로부터 얻어진 객체는 생성자와 무관하게 어떤 클래스로든 캐스딩 가능(Autocasting)
		//자동 형변환
		tire0 = new MichelinTire("미쉐린타이어");
		//부모 클래스로부터 얻어진 객체가 아닌 경우 해당 클래스의 강제 캐스팅 가능(Forcecasting)
		//강제 형변환
	}
}