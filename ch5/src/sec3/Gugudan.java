package sec3;

public class Gugudan {
	public static void main(String[] args) {
		//구구단 출력 프로그램(이중 for문)
		/*
		 2*1=2	3*1=3	4*1=4	....	9*1=9
		 2*2=4	3*2=6	.....................
		 2*3=6	............................. 
		 ..... ........................	9*9=81
		 */
		
		
		for(int a=1;a<10;a++) {
			for(int b=2;b<10;b++) {
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
			}
			System.out.print("\n");
		}
	}
}