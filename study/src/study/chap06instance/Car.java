package study.chap06instance;

public class Car {
	//�ʵ�: �ν��Ͻ� �ʵ�
	int speed;
	String model;
	String color;
	
	//�����ʵ�: ���� ������-> Ŭ���� Car�� �������� ���Ǵ� ������-> �ϳ��� ����
	public static int MaxSeatNum;//�����ʵ�� static�� �ٿ��ش�. 
	
	//������
	public Car() {
		
	}
	//�޼ҵ�: �ν��Ͻ� �޼ҵ�
	public void setSpeed(int s ) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}
	//���� �޼ҵ� : ��ü�� �������� �����Ѵ�.
	//���ٹ��: Ŭ�����̸�.�޼ҵ��̸�(Car.changeBattery)
	public static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
		
	}
}
