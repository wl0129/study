package study.chap08_interface_usage;

public class TodaySchdule {

	public static void main(String[] args) {
		// 변수
		int num;	// int -> 인터페이스 
		Person p1 = new Person("홍길동");
		p1.sb = new Television();
		p1.sb.turnOn();			// 추상메소드를 재정의한 메소드
		p1.sb.setMute(true);	// default 메소드
		p1.sb.turnOff();
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.turnOff();
		p1.method3(new Television());
		p1.watchMovie();
		RemoteControl.changeBattery();	// 정적 메소드
	}

}
