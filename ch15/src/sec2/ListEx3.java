package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList : 순차처리에는 부적합하고, 무작위처리에 적합하다.

public class ListEx3 {
	public static void main(String[] args) {
		
		String[] names = {"조재영", "조수민", "정우희", "장성필", "임소희", "김준호", "김기태" };
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long start;
		long end;
		
		start = System.nanoTime();	//	10억분의 1
		
		for(int i=0; i<names.length; i++) {
			list1.add(names[i]);
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : "+(end-start));
		
		for(int i=0; i<names.length; i++) {
			list2.add(names[i]);
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+(end-start));
		
		
		
	}
}