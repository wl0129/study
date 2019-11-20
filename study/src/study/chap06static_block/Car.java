package study.chap06static_block;

public class Car {
	//정적필드
	static int field1= 20;
	static int field2;
		//인스턴스 필드 : 객체 생성 후 메로리에 저장공가닝 할당이 된다음에 사용 필드
	
	int seatNum;
	int TireNum;
	int speed;
	//잘 안쓰이는 기능
	static {//블럭('{'로 시작해서  '}'로 끝나는 부분)
			//static {} : 정적 블럭
		field2 = 30; 	//초기화 수행
		
	}
	{
		TireNum =4;
	}
	//정적 메소드
	static void method() {
		//사용할 수 있는 필드 : 정적 필드만 사용 가능 
		field1 = 30;//정적 필드 : 가능
//		seatNum = 4;//불가 (인스턴스 필드)
//		setSpeed(5);// 인스턴스 메소드를 호출불가
//		mathod2(); //정적 메소드는 호출 가능
		
	}
	//인스턴스 메소드 
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	static void method2() {
		
	}
}
