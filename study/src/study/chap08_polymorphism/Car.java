package study.chap08_polymorphism;

public class Car {
	// 필드
	Tire fl = new HanKookTire("앞왼쪽", 5);
	Tire fr = new HanKookTire("앞오른쪽", 3);
	Tire bl = new NesenTire("뒤왼쪽", 4);
	Tire br = new NesenTire("뒤오른쪽", 6);
	
	// 운행 메소드
	// 타이어를 회전하면서 운전 : 고장잔 타이어의 위치를 알려준다.
	public int run() {
		System.out.println("자동차가 굴러갑니다.");
		if(!fl.roll()) {	// 타이어 펑크 발생
			System.out.println("앞왼쪽 바퀴 펑크");
			stop();
			return 1;	// 고장난 바퀴 위치 (1 : 앞왼쪽)
		}
		if(!fr.roll()) {	// 타이어 펑크 발생
			System.out.println("앞오른쪽 바퀴 펑크");
			stop();
			return 2;	// 고장난 바퀴 위치 (2 : 앞왼쪽)
		}
		if(!bl.roll()) {	// 타이어 펑크 발생
			System.out.println("뒤왼쪽 바퀴 펑크");
			stop();
			return 3;	// 고장난 바퀴 위치 (3 : 앞왼쪽)
		}
		if(!br.roll()) {	// 타이어 펑크 발생
			System.out.println("뒤오른쪽 바퀴 펑크");
			stop();
			return 4;	// 고장난 바퀴 위치 (4 : 앞왼쪽)
		}
		return 0;	// 펑크 발생 안함
	}
	
	public void stop() {
		System.out.println("차를 멈춥니다.");
	}
}
