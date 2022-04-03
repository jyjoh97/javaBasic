package ch4;

public class For {

	public static void main(String[] args) {
		

		
		for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=5; j++) {
				
				if(i % 2 == 1) {
					if (j % 2 ==1) {
						System.out.println(i+ "," + j  + "==O");
					} else {
						System.out.println(i+ "," + j  + "==X");						
					}
				} else {
					if (j % 2 == 1) {
						System.out.println(i+ "," + j  + "==X");						
					} else {
						System.out.println(i+ "," + j  + "==O");						
					}
				}
				
			}
				
		}
		
		
		
		
	}
}