package study.chap06igeter;

public class MainExample {

	public static void main(String[] args) {
		Member member=new Member("hong","홍길동","1234","1111","hong@naver.com");
		Member lee = new Member();
		lee.setId("lee");
		lee.setName("이순신");
		lee.setPw("1234");
		lee.setPhone("1111");
		lee.setEmail("lee@gmail.com");
		System.out.println("아이디: "+member.getId());
		System.out.println("이름:  "+member.getName());
		System.out.println("비밀번호: "+member.getPw());
		System.out.println("전화번호: "+member.getPhone());
		System.out.println("이메일:  "+member.getEmail());
	}

}
