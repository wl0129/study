package study.chap08_polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		for(int i = 0;i < 10;i++) {
			int problemLocation = myCar.run();
			if(problemLocation == 1) {	// �տ��ʹ����� ��ũ
				myCar.fl = new NesenTire("�տ���", 15);
			} else if(problemLocation == 2) {	// �տ�����
				myCar.fr = new HanKookTire("�տ�����", 13);
			} else if(problemLocation == 3) {	// �տ�����
				myCar.bl = new HanKookTire("�ڿ���", 12);
			} else if(problemLocation == 4) {	// �տ�����
				myCar.br = new NesenTire("�ڿ�����", 14);
			}
		}
	}

}
