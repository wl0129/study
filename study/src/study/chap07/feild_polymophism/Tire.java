package study.chap07.feild_polymophism;

public class Tire {
	public int maxRotation;			//����
	public int accumulatedRotation; //���� ȸ����
	public String location; 		//���� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location= location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {	//Tire �� �������� ���
		++accmulatedRotation;
		if(accumulatedRotation<maxRotation) {	//��� ���
			System.out.println(location + "Tire ����: "+ (maxRotation - accumulatedRotation));
			return true;	//��� ��� ����
			
		}else {		//������ �� ��
			System.out.println("***"+ location + "Ÿ�̾� ��ũ ***");
			return false; // ��ũ �߻� 
		}
	}
}
