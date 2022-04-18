package sec1;

import java.util.ArrayDeque;
import java.util.Deque;

//Deque : LIFO 및 FIFO 운용이 모두 가능한 자료 구조

public class DequeEx1 {
	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.addFirst("kim");		//가장 앞에 추가
		deque.addFirst("lee");
		deque.addLast("park");		//가장 뒤에 추가
		deque.addLast("kang");
		deque.add("gill");			//직전 명령의 위치에 추가
		System.out.println("deque의 값 : "+deque);
		
		deque.offerLast("lim");	//Queue처럼 가장 뒤에 추가
		deque.offerFirst("shin");	//Queue처럼 가장 앞에 추가
		System.out.println("\ndeque의 크기 : "+deque.size());
		System.out.println("deque의 값 : "+deque);
		
		deque.poll();		//Queue처럼 가장 처음 값 제거
		System.out.println("\ndeque의 값 : "+deque);
		
		deque.pop();		//Stack처럼 가장 마지막의 값 제거
		System.out.println("\ndeque의 값 : "+deque);
		//값 제거 : pollFirst(), pollLast(), remove(),
		//			removeLast(), removeFirst(), clear()
		//값 출력 : peekFirst(), peekLast(), peek()
		//요소 값 가져오기 : getLast(), getFirst()
		
	}
}