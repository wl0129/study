package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
		//�Ű������� � �ڽ� ��ü�� �־��ֳĿ� ���� �ڽİ�ü�� run() 

	}

}
