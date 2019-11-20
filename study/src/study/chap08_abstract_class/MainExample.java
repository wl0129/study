package study.chap08_abstract_class;

public class MainExample {

	public static void main(String[] args) {
		Aclass a= new Aclass();	//Aclass가 추상클래스이므로 객체화(로 생성) 불가
		Bclass b = new Bclass();	//추상클래스가 아니므로 객체화가 가능
		b.method1();
		b.method2();
		
	}

}
