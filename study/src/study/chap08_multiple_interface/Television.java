package study.chap08_multiple_interface;

//�������̽��� �����Ѵ�(implements)	
//����� ��Ӱ��迡���� ����Ѵ�.(extends)
//�������̽� : �������� �����ϴ�.

public class Television implements RemoteControl {
	
//Interface RemoteControl ���� ������ �߻� �޼ҵ带 ������ (�ʼ�)
	@Override
	public void turnOn() {
		System.out.println("�ڷ������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڷ������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�ڷ����� ������ "+volume + "���� ����");
	}
	//����Ʈ �޼ҵ�� �����޼ҵ�� ������ �ִ�. 
}
