package study.chap07.feild_polymophism;

public class HanKookTire extends Tire {
	//������ : default ������ -> �θ��� �����ڸ� ȣ��
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	//�ڽ� ��ü���� �θ��� �޼ҵ带 ������
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {//��� ��� ����
			System.out.println(location+ "HanKookTire ����: "+ (maxRotation-accumulatedRotation));
			return true;
		}else {	//������ ����
			System.out.println("***"+location+ "HanKookTire ��ũ***");
			return false;
		}
	}
}
