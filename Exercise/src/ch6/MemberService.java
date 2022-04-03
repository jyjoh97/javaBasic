package ch6;
//Ex15
public class MemberService {
	
	public String id;
	public String password;
	boolean asd;
	
	public MemberService() {
	}
	

	public boolean login(String id, String password) {
		if(id == "hong") {
			if(password == "12345") {
				asd = true;
			}	else {
				asd = false;
			}
			
			}	else {
				asd = false;
			}
		return asd;
		}
			
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

	
	
}