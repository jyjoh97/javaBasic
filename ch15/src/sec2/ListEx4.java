package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	
	private String uid;
	private String pw;
	private String email;
	private String tel;
	//Constructor/setter/getter 생성
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	
}

public class ListEx4 {
	public static void main(String[] args) {
		//ArrayList를 활용하여 다섯명의 정보를 저장하기

		List<Member> list1 = new ArrayList<Member>();
		Member m1 = new Member("kkt", "1234", "kkt@naver.com", "010-1234-1234");		
		Member m2 = new Member("조재영", "4321", "jyjoh97@naver.com", "010-213-3214");
		Member m3 = new Member("권오성", "4213", "jyjoh9702@naver.com", "010-8534-9080");
		Member m4 = new Member("이준권", "5231", "jyjoh972@naver.com", "010-8465-5643");
		Member m5 = new Member("이택호", "7421", "jyjoh970205@naver.com", "010-8975-1234");
		list1.add(m1);
		list1.add(m2);
		list1.add(m3);
		list1.add(m4);
		list1.add(m5);
		
		System.out.println("아이디\t비밀번호\t이메일\t전화번호");
		
		for(Member m : list1) {
			System.out.println(m.getUid());
			
		}
		
		
		
		
		
	}
}