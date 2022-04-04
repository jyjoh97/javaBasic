package ch6;

public class Account {

	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	private int balance = 0;
	
	
	public void setBalance(int balance) {
		if(balance<=MAX_BALANCE && balance>=MIN_BALANCE) {
			this.balance = balance;
		}
	}
			
	public int getBalance() {
		return this.balance;
	}

	
	
	



	
	
}