package study.chap06_Exercise15;

public class MemberService {
	//�޼ҵ� : �α��ΰ� �α׾ƿ�
	boolean login(String id, String password) {// id: hong , password : 1234
		//���ǹ� == �ּҺ�, equals �����
		if(id.equals("hong")&& password.equals("12345"))
			return true;
		else
			return false;
		
	}
	
	void logout (String id) {
		//"�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� ���α׷��� ����
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		
	}

}
