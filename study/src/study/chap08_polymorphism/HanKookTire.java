package study.chap08_polymorphism;

public class HanKookTire implements Tire {
	// �ʵ� : Tire Class���� ���ǵ� -> ���� Ŭ����
	String location;
	int maxRotation;
	int accumulatedRotation;
	
	// ������
	public HanKookTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Tire �������̽��� �޼ҵ带 ������
	// ������ �������� ���� : ����, ����ȸ����, ��ũ, ��ġ�� ��ȯ
	@Override
	public boolean roll() {
		accumulatedRotation++;	// ������ ȸ��
		if(accumulatedRotation < maxRotation) {	// ��� ���
			System.out.println(location + " HanKookTire ���� ���� :"
					+ (maxRotation - accumulatedRotation));
			return true;	// ��� ��� ����
		}
		else {
			System.out.println("*** " + location + " HanKookTire ��ũ ****");
			return false;
		}
	}

}
