package sec4;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		//Random.nextInt(종료값) + 시작값
		//Random.nextDouble() : 0~1의 실수로 바꿔줌
		//Random.nextBoolean() : true 또는 false를 무작위로 바꿔줌
		Random random = new Random(5);		
		int[] a =new int[6];
		
		for(int i=0; i<6; i++) {
			a[i] = random.nextInt(45)+1;
		}
		Arrays.sort(a);
		for(int b : a) {
			System.out.print(b+"\t");
		}
	}
}