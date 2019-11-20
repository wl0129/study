package study.chap08_interface_usage;

public class Television implements RemoteControl {
	int volume;
	int mute;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("������ " + volume + "�� ����");
	}

}
