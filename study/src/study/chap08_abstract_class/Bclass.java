package study.chap08_abstract_class;

public class Bclass extends Aclass {
	//method1()은 재정의하지 않아도 됨 -> 재정의해도 된다. : method1()이 존재함 
	//상속받은 Aclass의  추상메소드 재정의해주어야 함
	@Override
	public void method2() {
		System.out.println("Bclass: method2()호출됨");

	}

}
