package study.chap08_anonymous;

	//public�� �����ϴ��� public interface�� ����.
public interface RemoteControl {
	//��� : ����ó�� ����Ǿ� ������ ���
	int MAX_VOULUME =100;
	int MIN_VOULUME = 0;
	//public static final �� ������ ����
	public static final int CONSTANT_VALUE = 10;
	
	//�޼ҵ� : �߻�, default, ����
	void turnOn(); //�߻�޼ҵ�
	void turnOff();
	void setvolume(int volume);
	
	//default �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}else {
			System.out.println("���� ����");
		}
	}
	//���� �޼ҵ�
	
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ �մϴ�.");
	}
}
