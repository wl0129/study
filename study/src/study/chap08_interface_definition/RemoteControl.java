package study.chap08_interface_definition;
/*
 * �������̽� : ��ü�� ����ϱ� ���� ���� �κ� (��ü�� ����� �Ϻ� )
 * ������� : ��� (static final ), �޼ҵ� 
 * 		Ŭ������ ������, �ʵ� ���� �κ��� ����. 
 * 		���: public ����������
 */
public interface RemoteControl {
	public static final int MAX_VOLUME= 10;
		//���� ������ public�� �����ص� �⺻�� public�̴�. 
	static final int MIN_VOLUME = 0;
	//�޼ҵ� : �߻�, ����Ʈ, ����
	//�߻� �޼ҵ� : ��ȯ�� �޼ҵ��̸� (�Ű�����...); //�����κ��� ���� �޼ҵ� 
		//���� Ŭ�������� �����Ǹ� ���־�� �� 
	public void turnOn();//���� �Ǿ��ְ� �����κ��� ���� �޼ҵ� 
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� : ����κ��� �ִ� �޼ҵ� - ���� Ŭ�������� �� ������ �� �ʿ����.(�׷����� ���� �����Ǹ� �ؼ� ���)
	//default Ű���带 ��� 
	//�������̽��� ��� ���� -> ��ӹ��� �������̽��� default �޼ҵ�
	// �߻�޼ҵ�� ���� ���� (����) ���� 
	default void setMute(boolean mute) { 	//���Ǻκ��� ����
		if (mute) {
			System.out.println("���� ó���� �մϴ�.");
		}else {
			System.out.println("���� ������ �մϴ�.");
		}
	}
	//�����޼ҵ�: �������̽� �̸����� ����(���)����-> ���� ����� ������ �� 
	
	
}
