package ch6;
//setter getter 사용
//0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
//Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 
//										유지
public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : "+account.getBalance());

	}
}