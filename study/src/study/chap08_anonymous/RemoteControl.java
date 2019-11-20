package study.chap08_anonymous;

	//public을 생략하더라도 public interface와 같다.
public interface RemoteControl {
	//상수 : 변수처럼 선언되어 있지만 상수
	int MAX_VOULUME =100;
	int MIN_VOULUME = 0;
	//public static final 이 생략된 것임
	public static final int CONSTANT_VALUE = 10;
	
	//메소드 : 추상, default, 정적
	void turnOn(); //추상메소드
	void turnOff();
	void setvolume(int volume);
	
	//default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	//정적 메소드
	
	static void changeBattery() {
		System.out.println("배터리를 교환 합니다.");
	}
}
