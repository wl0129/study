package study.chap07.exercise07;

public class SnowTire extends Tire {
	//부모 클래스 Tire의 메소드 run()을 재정의 
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}

}
