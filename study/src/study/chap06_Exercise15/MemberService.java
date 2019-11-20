package study.chap06_Exercise15;

public class MemberService {
	//메소드 : 로그인과 로그아웃
	boolean login(String id, String password) {// id: hong , password : 1234
		//조건문 == 주소비교, equals 내용비교
		if(id.equals("hong")&& password.equals("12345"))
			return true;
		else
			return false;
		
	}
	
	void logout (String id) {
		//"로그아웃 되었습니다."가 출력되도록 프로그램을 구현
		System.out.println("로그아웃 되었습니다.");
		
	}

}
