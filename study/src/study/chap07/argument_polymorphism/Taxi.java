package study.chap07.argument_polymorphism;

public class Taxi extends Vehicle { 
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}