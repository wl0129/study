package study.chap08_multiple_interface;

//�������̽��� �������� ��������

public class SmartTelevision implements RemoteControl, Searchable {//�ʿ��ϸ� ��� �߰� 

	//Seachable �߻� �޼ҵ� search() ������
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");

	}
	//RemonteControl�� �ִ� �߻� �޼ҵ带 ������
	@Override
	public void turnOn() {
		System.out.println("����Ʈ TV ������ �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ TV ������ ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println(volume + "���� ����");

	}

}
