package study.chap07.inherit;

public class CellPhone {
	//�ʵ� 
	String model;
	String Color;
	
	//������
	
	//�޼ҵ� 
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	public void sendMessage(String message) {
		System.out.println(message + "�� �����մϴ�.");
	}
	public String receiveMessage() {
		System.out.println("�޽����� ���� �մϴ�.");
		return "���ŵ� ������";
	}
}
