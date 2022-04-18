package sec0;

//Abstract Factory : 관련있는 객체들을 모아서 팩토리로 만들고 조건에 따라 팩토리중에서 선택하게 하는 패턴

public interface SuitAbstractFactory {
	
	Suit createsuit();
	
	
}