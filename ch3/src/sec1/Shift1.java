package sec1;

public class Shift1 {
	public static void main(String[] args) {
		//시프트(자리이동) 연산 -> 비트 연산
		
		
		int a = 20;
		System.out.println("a>>2 : " + (a>>2));		//5
		
		/*16	8	4	2	1
		  1		0	1	0	0	
				1	0	1	0		-0
					1	0	1		-0	0		
		*/
		
		
		System.out.println("a<<2 : " + (a<<2));		//80
		
		
		
		/*
  64 32   16	8	4	2	1
		  1		0	1	0	0
      1	  0		1	0	0	0
   1  0	  1		0	0	0	0	   
		*/
		
		
		System.out.println("a>>>2 : "+(a>>>2));		//5
	  //System.out.println("a<<<2 : "+(a<<<2));
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}