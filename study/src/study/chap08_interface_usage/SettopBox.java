package study.chap08_interface_usage;

public class SettopBox implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("��ž�ڽ� ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("��ž�ڽ� ������ ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("������ " + volume + "�� ����");
	}
	
	// �߰� �޼ҵ�
	public void storeFile(String name) {
		System.out.println("���� " + name + "�� �����մϴ�.");
	}
	
	public void showMovie(String name) {
		System.out.println("��ȭ " + name + "�� ��û");
	}
}
