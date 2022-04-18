package sec2;

import java.util.ArrayList;
import java.util.List;

class Human{//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	private String name;
	private int sno;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
}

public class ListEx1 {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("김기태");		//추가
		list1.add("길정훈");
		list1.add("김동협");
		System.out.println("list1 : "+list1);
		System.out.println("list1의 크기 : "+list1.size());
		System.out.println("\n");
		
		for(String name : list1) {	//순회
			System.out.println("회원명 : "+name);
		}
		
		String irum = list1.get(1);	//★★★인덱스가 1인 요소값 대입★★★
		System.out.println("\n인덱스가 1인 요소 : "+irum);
		System.out.println("인덱스가 1인 요소 : "+list1.get(1));
		
		list1.add("김성민");
		list1.remove(1);		//인덱스가 1인 요소 제거
		System.out.println("\nlist1 : "+list1);
		
		List<Human> h1 = new ArrayList<>();
		Human m1 = new Human();
		m1.setName("김예은");
		m1.setSno(5);
		m1.setAge(39);
		h1.add(m1);
		
		Human m2 = new Human();
		m2.setName("김태균");
		m2.setSno(6);
		m2.setAge(28);
		h1.add(m2);
		System.out.println("\n");
		
		
		System.out.println("회원명\t나이\t번호");
		for(Human h : h1) {
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\t");
			System.out.print(h.getSno()+"\n");
		}
		
		
	}
}