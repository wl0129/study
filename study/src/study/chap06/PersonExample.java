package study.chap06;

public class PersonExample {

	public static void main(String[] args) {
		Person p1= new Person();
		System.out.println("키: "+p1.height);
		System.out.println("이름 : "+p1.name);
		
		p1.height=20.0;//실체가 있어야 접근이 가능하다.
		
	}

}
