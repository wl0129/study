package study.chap07.polymophism;

public class MainExample {

	public static void main(String[] args) {
		Dog dog = new Dog(); 	//개 
		dog.age = 11;	//부모가 정의한 필드
		dog.sound(); 	//멍멍(자식이 재정의한 메소드)
		dog.method();	//부모가 정의한 메소드
		dog.count =2; 	//자식이 정의한 메소드
		//참조변수 dog을 사용해서 접근 가능한것 : 부모 + 자식
		
		//자동타입변환: 부모객체가 자식객체를 대입받는 것
		Animal animal = dog;//자동타입변환에 의해서 
		animal.kind= "개";	//부모가 정의한 필드
		animal.age =12;		//부모가 정의한 필드
//		animal.count =2; 	//에러->animal 참조변수는 Animal 이므로
			//타입이므로 부모가 정의한 필드와 메소드만 접근 가능
//		animal.method();	//에러
		animal.sound();		//부모가 부모메소드 -> 예외 (재정의) ->
		animal.method1();
		
		Animal a2 = new Cat(); //자동타입변환 
		a2 = dog;
		a2.sound(); //부모의 메소드가 호출되지 않고 자식이 재정의한 메소드가 호출됨.
		//부모타입의 참조변수에 어떤 자식 객체를 대입하느냐에 따라서 
		//대입한 자식의 성격이 나온다.(메소드가 실행된다.)-> 다형성 
		//1. 자동타입변환
		//2. 자식이 부모의 메소드를 재정의 
		
	}

}
