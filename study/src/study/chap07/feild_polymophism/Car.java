package study.chap07.feild_polymophism;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("�ڿ���",3);
	Tire backRightTire = new Tire("�ڿ�����",4);
	
	//������
	//�޼ҵ�
	int run() {//�ڵ��� ���� 
		System.out.println("�ڵ����� �޶��ϴ�.");
		if(frontLeftTire.roll()== false) {
			stop();//�ڵ����� ����
			return 1; //�տ��� Ÿ�̾�
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;	//���������� ��� ������ �ȴ�. ������ Ÿ�̾ ����
	}

	private void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		
	}
}
