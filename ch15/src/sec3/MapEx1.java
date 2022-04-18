package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map<Key, value>

public class MapEx1 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("조재영", 1);
		map.put("이규호", 2);
		map.put("김기태", 3);
		map.put("정우희", 4);
		map.put("김태균", 5);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("조재영의 번호 : "+map.get("조재영"));
		System.out.println("이규호의 번호 : "+map.get("이규호"));
		System.out.println("김기태의 번호 : "+map.get("김기태"));
		System.out.println("정우희의 번호 : "+map.get("정우희"));
		System.out.println("김태균의 번호 : "+map.get("김태균"));
		map.remove("김기태");		//해당 데이터 제거
		//-------------------------------key와 value의 분리 ------------------
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();	//키
			Integer value = map.get(key);		//값
			System.out.println("key : "+key+", value " +value);
		}
		
		
		
		
	}
}