package study.chap06instance;

public class CarExample {

	public static void main(String[] args) {
		Car.MaxSeatNum =6; //���뵥����, ��ü �������� ����
		Car.changeBattery();//��ü�� �������� ����
		Car car1 = new Car();
		car1.setSpeed(50);
		car1.speed=60;
		System.out.println("����ӵ� : "+car1.getSpeed());

	}

}
