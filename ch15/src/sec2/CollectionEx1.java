package sec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student { String name; }

//★★★List : 순서형, 중복 저장 가능 -> 목록							 => ArrayList, Vector, LinkedList
//Set : 비순서형, 중복 저장 안됨 -> 집합 							 => HashSet, TreeSet
//Map : 비순서형, 키와 값으로 저장, 키 중복 불가능, 값 중복 가능 -> 쌍 	 	 => HashMap, Hashtable,

public class CollectionEx1 {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); 		//Vector, LinkeList 변환 가능
		ArrayList<String> list2 = new ArrayList<String>();	//			//			불가능
		
		
		Set<String> set1 = new HashSet<String>();		//TreeSet 변환 가능
		HashSet<String> set2 = new HashSet<String>(); 	//	  //	  불가능
		
		
		//Map<Student, Integer> map1 = HashMapM<>();		=> 다른 형태의 Map으로 변환 가능
		//HashMap<Student, Integer> map2 = HashMap<>();		=> 			//		  불가능
		
		
		
		
	}
}