package study.chap08_interface_definition;
/*
 * 인터페이스 : 객체와 통신하기 위한 정합 부분 (객체의 기능의 일부 )
 * 구성멤버 : 상수 (static final ), 메소드 
 * 		클래스의 생성자, 필드 같은 부분이 없다. 
 * 		상수: public 접근제한자
 */
public interface RemoteControl {
	public static final int MAX_VOLUME= 10;
		//접근 제한자 public을 생략해도 기본이 public이다. 
	static final int MIN_VOLUME = 0;
	//메소드 : 추상, 디폴트, 정적
	//추상 메소드 : 반환형 메소드이름 (매개변수...); //구현부분이 없는 메소드 
		//구현 클래스에서 재정의를 해주어야 함 
	public void turnOn();//선언만 되어있고 구현부분이 없는 메소드 
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트 메소드 : 실행부분이 있는 메소드 - 구현 클래스에서 꼭 재정의 할 필요없음.(그렇지만 보통 재정의를 해서 사용)
	//default 키워드를 사용 
	//인터페이스도 상속 가능 -> 상속받은 인터페이스는 default 메소드
	// 추상메소드로 정의 가능 (변경) 가능 
	default void setMute(boolean mute) { 	//정의부분이 있음
		if (mute) {
			System.out.println("무음 처리를 합니다.");
		}else {
			System.out.println("무음 해제를 합니다.");
		}
	}
	//정적메소드: 인터페이스 이름으로 접근(사용)가능-> 공통 기능을 구현할 때 
	
	
}
