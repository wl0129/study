package study.chap07.feild_polymophism;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	//생성자
	//메소드
	int run() {//자동차 운행 
		System.out.println("자동차가 달랍니다.");
		if(frontLeftTire.roll()== false) {
			stop();//자동차를 정지
			return 1; //앞왼쪽 타이어
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;	//정상적으로 계속 운행이 된다. 빵구난 타이어가 없음
	}

	private void stop() {
		System.out.println("자동차가 멈춥니다.");
		
	}
}
