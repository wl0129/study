package study.chap06static_block;

public class Car {
	//�����ʵ�
	static int field1= 20;
	static int field2;
		//�ν��Ͻ� �ʵ� : ��ü ���� �� �޷θ��� ��������� �Ҵ��� �ȴ����� ��� �ʵ�
	
	int seatNum;
	int TireNum;
	int speed;
	//�� �Ⱦ��̴� ���
	static {//��('{'�� �����ؼ�  '}'�� ������ �κ�)
			//static {} : ���� ��
		field2 = 30; 	//�ʱ�ȭ ����
		
	}
	{
		TireNum =4;
	}
	//���� �޼ҵ�
	static void method() {
		//����� �� �ִ� �ʵ� : ���� �ʵ常 ��� ���� 
		field1 = 30;//���� �ʵ� : ����
//		seatNum = 4;//�Ұ� (�ν��Ͻ� �ʵ�)
//		setSpeed(5);// �ν��Ͻ� �޼ҵ带 ȣ��Ұ�
//		mathod2(); //���� �޼ҵ�� ȣ�� ����
		
	}
	//�ν��Ͻ� �޼ҵ� 
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	static void method2() {
		
	}
}
