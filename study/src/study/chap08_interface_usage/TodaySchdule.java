package study.chap08_interface_usage;

public class TodaySchdule {

	public static void main(String[] args) {
		// ����
		int num;	// int -> �������̽� 
		Person p1 = new Person("ȫ�浿");
		p1.sb = new Television();
		p1.sb.turnOn();			// �߻�޼ҵ带 �������� �޼ҵ�
		p1.sb.setMute(true);	// default �޼ҵ�
		p1.sb.turnOff();
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.turnOff();
		p1.method3(new Television());
		p1.watchMovie();
		RemoteControl.changeBattery();	// ���� �޼ҵ�
	}

}
