package study.chap07.exercise07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;//�ڵ� Ÿ�Ժ�ȯ
		snowTire.run();// �ڽ��� �������� �޼ҵ尡 ȣ���.
		tire.run(); 	//�θ�Ÿ������ run()�� ȣ���ϸ� 
		//�θ��� �޼ҵ� run () �� ������� �ʰ� �ڽ��� �������� 
			// run()�� ȣ��� 
		

	}

}
