package study.chap06Member;

public class Member {
	String name;		//default: 같은 패키지내에서만 접근 가능 
	String id;			
	String password;
	int age;
	
	//생성자 작성: 매개변수가 (이름, id)가 주어져있음. 
	Member(String name, String id){
		this.name= name;
		this.id = id;
	}
	
}
