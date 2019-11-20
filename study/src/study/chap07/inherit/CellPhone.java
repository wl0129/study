package study.chap07.inherit;

public class CellPhone {
	//필드 
	String model;
	String Color;
	
	//생성자
	
	//메소드 
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void sendMessage(String message) {
		System.out.println(message + "를 전송합니다.");
	}
	public String receiveMessage() {
		System.out.println("메시지를 수신 합니다.");
		return "수신된 데이터";
	}
}
