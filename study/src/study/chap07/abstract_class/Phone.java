package study.chap07.abstract_class;

public abstract class Phone {
	//�ʵ�
		public String owner;
		
		//������
		public Phone(String owner) {
			this.owner = owner;
		}
		
		//�޼ҵ�
		public void turnOn() {
			System.out.println("�� ������ �մϴ�.");
		}	
		public void turnOff() {
			System.out.println("�� ������ ���ϴ�.");
		}
		//�߻� �޼���
		public abstract void sendMessage(String message);
  
}
