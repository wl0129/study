package study.chap08_anonymous;

public class MainExample {

	public static void main(String[] args) {
		//�ڷ����� ���� ��ü�� ���  -> ��ü�� �̸��� ����
//		RemoteControl r = new Television();
		//�͸� ��ü�� Ŭ���� �̸��� ����
		//Ŭ���� �̸��� �����Ƿ�  �����ڸ� �������̽� �̸����� ��� 
		RemoteControl rc = new RemoteControl() {
			//���� ��ü  : RemoteControl�� implements(����)
			//�߻� �޼ҵ带 �������ؾ���.
			//Ŭ���� ���̴�.: �ʵ�,default �����ڸ� ���� , �޼ҵ�
			int field1 = 20;
			
			//�޼ҵ� 
			void method1() {
				turnOn();
			}
			//���� ��ü�̹Ƿ� �߻�޼ҵ带 �������Ѵ�. 
			@Override
			public void turnOn() {
				System.out.println("�ڷ������� �մϴ�. ");
				
			}

			@Override
			public void turnOff() {
				System.out.println("�ڷ������� ���ϴ�.");
				
			}

			@Override
			public void setvolume(int volume) {
				System.out.println("������ "+volume+"�� ����");
				
			}
			//default �޼ҵ嵵 ����
		};		
		rc.turnOn();
		rc.setvolume(20);
		rc.turnOff();
	//	rc.field1= 20; //��� �Ұ�  (������ü �������� ����Ѵ�.) 
	//	rc.method();	//���Ұ�( ������ü �������� ���)
		//Ŭ���� �̸��� �����Ƿ� ���� Ÿ�Ժ�ȯ�� �� �� ����. 
		
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
				
			}
			
			@Override
			public void setvolume(int volume) {
				System.out.println("����� ������"+ volume+ "�� ����");
				
			}
		};
		audio.turnOn(); //�޼ҵ带 �����Ϸ��� ȣ���� ���־�� ��.
		audio.setvolume(30);
		audio.turnOff();
		
		
		
	}

}
