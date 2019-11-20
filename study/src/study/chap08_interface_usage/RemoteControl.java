package study.chap08_interface_usage;

public interface RemoteControl {
	// ���, �޼ҵ�
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;	// ������ �ƴϰ� �����
	
	// �߻� �޼ҵ�
	public void turnOn();	// ���� �Ǿ��ְ� �����κ��� ���� �޼ҵ�
	public void turnOff();
	public void setVolume(int volume);
	
	// default �޼ҵ� : �ڹ� 8���� �߰���
	default void setMute(boolean mute) {	// ���Ǻκ��� ����
		if(mute) {
			System.out.println("���� ó���� �մϴ�.");
		} else {
			System.out.println("���������� �մϴ�.");
		}
	}
	
	// �ڹ� 8���� �߰��� ���
	// ���� �޼ҵ� : �������̽� �̸����� ����(���) ���� -> ���� ����� ������ ��
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
}
