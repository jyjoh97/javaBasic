package sec1;

import java.util.LinkedList;
import java.util.Queue;

//FIFO 구조 : Queue(가장 처음 값이 먼저 출력되거나 제거됨) - add/offer(값 추가) , poll(값 제거)

public class QueueEx1 {
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(20);		//값 입력
		que.add(50);
		que.offer(30);		//값 입력
		que.offer(40);
		System.out.println("가장 처음에 입력된 값 : "+que.peek());
		System.out.println("que의 사이즈 : " +que.size());
		
		que.remove();
		System.out.println("\n값 제거 후 que의 사이즈 : "+que.size());
		System.out.println("가장 처음에 입력된 값 : "+que.peek());
		
		que.poll();		//처음 값 제거
		System.out.println("\n값 제거 후 que의 사이즈 : "+que.size());
		System.out.println("가장 처음에 입력된 값 : "+que.peek());

	}
}