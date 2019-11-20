package study.chap08_interface_usage;

public class Person {
	// �ʵ�, ������, �޼ҵ�
	RemoteControl sb;	// �ʵ�� �������̽��� ��� (����ó�� ��� ����)
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// ������ : �Ű������� �������̽��� ���
	public Person(RemoteControl rc) {
		this.sb = rc;
	}
	
	// �޼ҵ�
	public void watchMovie() {	// �޼ҵ�
		// ���ú����� �������̽��� ���
		RemoteControl rc = new SettopBox();
		rc.turnOn();
		SettopBox s = (SettopBox)rc;
		s.showMovie("��Ÿ����");
	}
	
	// �޼ҵ��� �Ű������� �������̽��� ���
	public void method3(RemoteControl rc) {
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
	}
}
