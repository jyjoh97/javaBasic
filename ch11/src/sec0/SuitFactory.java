package sec0;

public class SuitFactory {
	
	static public Suit getSuit(SuitAbstractFactory suitAbstractFactory) {
		return suitAbstractFactory.createsuit();
	}
	
	
	
	
	
}