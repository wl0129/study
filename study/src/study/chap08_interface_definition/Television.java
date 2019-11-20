package study.chap08_interface_definition;

//인터페이스를 구현한다(implements)	
//참고로 상속관계에서는 상속한다.(extends)
//인터페이스 : 여러개가 가능하다.

public class Television implements RemoteControl {
	
//Interface RemoteControl 에서 정의한 추상 메소드를 재정의 (필수)
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("텔레비전 볼륨을 "+volume + "으로 설정");
	}
	//디폴트 메소드와 정적메소드는 가지고 있다. 
}
