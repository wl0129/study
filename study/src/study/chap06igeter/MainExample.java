package study.chap06igeter;

public class MainExample {

	public static void main(String[] args) {
		Member member=new Member("hong","ȫ�浿","1234","1111","hong@naver.com");
		Member lee = new Member();
		lee.setId("lee");
		lee.setName("�̼���");
		lee.setPw("1234");
		lee.setPhone("1111");
		lee.setEmail("lee@gmail.com");
		System.out.println("���̵�: "+member.getId());
		System.out.println("�̸�:  "+member.getName());
		System.out.println("��й�ȣ: "+member.getPw());
		System.out.println("��ȭ��ȣ: "+member.getPhone());
		System.out.println("�̸���:  "+member.getEmail());
	}

}
